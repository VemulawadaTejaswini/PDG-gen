import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>b){
          int x=a;
           a = b;
           b = x;
           
        }else if(b>c){
          int x = b;
          b = c;  
          c = x;
        }else if(a>b){
          int x = a;
          a = b;
          b = x;
        }
          System.out.println(a+" "+b+" "+c);

 }