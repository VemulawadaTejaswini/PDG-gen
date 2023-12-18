import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   String s=kbd.next();
   String a="R";
   int cou=0;
   for(int i=0;i<3;i++){
   if(s.charAt(i)==a.charAt(0)){
     cou++;
 }
}
    System.out.println(cou);
 }
}
