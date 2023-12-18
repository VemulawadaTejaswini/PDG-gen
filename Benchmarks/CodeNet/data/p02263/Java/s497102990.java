import java.util.Scanner;
import java.lang.Math;
import java.lang.System;
import java.io.*;
class Main{

  private static int top;
  private static String[] s=new String[1000];

  public static void initialize(){
    top=0;
    return;
  }

  public static boolean isEmpty(){
    if(top==0)
      return true;
    return false;
  }

  public static boolean isFull(){
    if(top>=1000)
      return true;
    return false;
  }

  public static void push(String str){
    if(isFull()) System.out.println("Error");
    s[++top]=str;
  }

  public static String pop(){
    if(isEmpty()) System.out.println("Error");
    return s[top--];
  }

  public static void main(String args[]) throws Exception{
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String line= br.readLine();
      int a,b;
      s[0]=null;

      //while ((line = br.readLine()) != null) {
        //System.out.println(line);
        String[] str = line.split(" ");
        for(int i=0;i<str.length;i++){
          //System.out.println(str[i]);
          if(str[i].equals("+")){
            b=Integer.parseInt(pop());
            a=Integer.parseInt(pop());
            push(String.valueOf(a+b));
            //System.out.println(a+b);
          }
          else if(str[i].equals("-")){
            b=Integer.parseInt(pop());
            a=Integer.parseInt(pop());
            push(String.valueOf(a-b));
            //System.out.println(a-b);
          }
          else if(str[i].equals("*")){
            b=Integer.parseInt(pop());
            a=Integer.parseInt(pop());
            push(String.valueOf(a*b));
            //System.out.println(a*b);
          }
          else{
            push(str[i]);
          }
        }

      //System.out.println("done");
      }
      //System.out.println("done");
      String answer=pop();
      System.out.println(answer);
    //}
  }
}

