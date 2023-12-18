import java.util.*;
import java.lang.*;
class Main {
  static int stacksize = 200;
  static int stackpointer = 0;
  static int [] stack = new int[stacksize];
//push
  static void push(int num){
    stack[stackpointer++] = num;
  }
  //pop
  static int pop(){
    return stack[--stackpointer];
  }
  //main
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String [] s = sc.nextLine().split("\\s+");
    for(int i = 0; i<s.length; i++){

      if(s[i].equals("+")){
        push(pop()+pop());
      }else if(s[i].equals("-")){
        push(-(pop()-pop()));
      }else if(s[i].equals("*")){
        push(pop()*pop());
      }else{
        push(Integer.valueOf(s[i]));
      }
    }
    System.out.println(pop());
  }
}
