import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   String T=kbd.next();
   String[] t = T.split("");

   for(int i=0;i<T.length()-1;i++){
   if(t[i].equals("P")&&t[i+1].equals("?"))
   t[i+1]="D";
   if(t[i].equals("?")&&t[i+1].equals("D"))
   t[i]="P";
 }
 for(int i=0;i<T.length();i++){
   if(t[i].equals("?"))
     t[i]="D";
 }
 for(int i=0;i<T.length();i++)
 System.out.print(t[i]);
 }
}
