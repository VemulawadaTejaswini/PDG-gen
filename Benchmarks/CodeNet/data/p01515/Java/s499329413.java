import java.util.*;
class Main {
  public static void main(String args[]){
    new Main().run();
  }
 
  int idx;
  String s;
 
  Scanner sc = new Scanner(System.in);
  void run(){
    while(true){
      s = sc.nextLine();
      if(s.equals("#"))break;
      idx=0;
      Expr e = equation();
      boolean ans = true;
      for(int i = 0 ; i < 1 << 11; i++){
        Map<Character,Boolean> env = new HashMap<Character, Boolean>();
        for(int j = 0 ; j < 11; j++){
          env.put((char)('a' + j), ((i >> j) & 1) == 1);
        }
        ans = ans && e.eval(env);
      }
      System.out.println(ans ? "YES" : "NO");
    }
  }
 
  Expr equation(){
    Expr e1 = formula();
    idx++;
    Expr e2 = formula();
    return new Eq(e1,e2);
  }
 
  Expr formula(){
    char c;
    switch(c = s.charAt(idx++)){
      case 'T': 
        return new True();
      case 'F':
        return new False();
      case '-': 
        return new Not(formula());
      case '(':
        Expr e1 = formula();
        Expr e3 = null;
        if(s.charAt(idx) == '*'){
          idx++;
          Expr e2 = formula();
          e3= new And(e1,e2);
        }else if(s.charAt(idx)=='+'){
          idx++;
          Expr e2 = formula();
          e3= new Or(e1,e2);
        } else{
          idx++;
          idx++;
          Expr e2 = formula();
          e3 = new Imp(e1,e2);
        }
        idx++;
        return e3;
      default:
        return new Var(c);
    }
  }
}
 
abstract class Expr {
  abstract boolean eval(Map<Character, Boolean> env);
}
 
class Eq extends Expr{
  Expr e1,e2;
  Eq(Expr a, Expr b){
    e1=a;
    e2=b;
  }
 
  public boolean eval(Map<Character, Boolean> env){
    return e1.eval(env) == e2.eval(env);
  }
 
  public String toString(){
    return e1 + "=" + e2;
  }
}
 
class Not extends Expr{
  Expr e;
  Not(Expr expr){
    this.e = expr;
  }
 
  public boolean eval(Map<Character, Boolean> env){
    return !(e.eval(env));
  }
 
  public String toString(){
    return "-" + e;
  }
}
 
class False extends Expr {
  False(){
  }
 
  public boolean eval(Map<Character, Boolean> env){
    return false;
  }
 
  public String toString(){
    return "F";
  }
}
 
class True extends Expr {
  True(){
  }
 
  public boolean eval(Map<Character, Boolean> env){
    return true;
  }
 
  public String toString(){
    return "T";
  }
}
 
class And extends Expr {
  Expr e1;
  Expr e2;
  And(Expr a, Expr b){
    e1 = a;
    e2 = b;
  }
 
  public boolean eval(Map<Character, Boolean> env){
    return e1.eval(env) && e2.eval(env);
  }
 
  public String toString(){
    return "(" + e1 + "*" + e2 +")";
  }
}
 
class Or extends Expr {
  Expr e1;
  Expr e2;
  Or(Expr a, Expr b){
    e1 = a;
    e2 = b;
  }
 
  public boolean eval(Map<Character, Boolean> env){
    return e1.eval(env) || e2.eval(env);
  }
 
  public String toString(){
    return "(" + e1 + "+" + e2 +")";
  }
}
 
class Imp extends Expr {
  Expr e1;
  Expr e2;
  Imp(Expr a, Expr b){
    e1 = a;
    e2 = b;
  }
  public boolean eval(Map<Character, Boolean> env){
    return !(e1.eval(env)) || e2.eval(env);
  }
 
  public String toString(){
    return "(" + e1 + "->" + e2 +")";
  }
}
 
class Var extends Expr {
  public char name;
  Var(char c){
    name =c;
  }
 
  public boolean equals (Var v){
    return name == v.name;
  }
 
  public boolean eval(Map<Character, Boolean> env){
    return env.get(name);
  }
 
  public String toString(){
    return name+"";
  }
}