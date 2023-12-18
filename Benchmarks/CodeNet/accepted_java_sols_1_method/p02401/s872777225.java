import java.util.*;

class Main{
    Scanner sc = new Scanner(System.in);
    
    Main(){
     while(true){
      int a = sc.nextInt();
      String op = sc.next();
      int b = sc.nextInt();
      if (op.equals("?"))break;
      int ans = 0;
      switch ( op ){
       case "+" :
        ans = a+b;
        break;
       case "-" :
        ans = a-b;
        break;
       case "*" :
        ans = a*b;
        break;
       case "/" :
        ans = a/b;
        break;
       }
       System.out.printf("%d\n",ans);
      }
    }
    public static void main(String[] args){
    new Main();
    }    
}
