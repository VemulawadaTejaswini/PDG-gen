import java.util.Scanner;

public class Main2{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   String c=kbd.next();
   String r="W";
   int num=0;
   int a=0;
   for(int i=0;i<n;i++){
   if(c.charAt(i)==r.charAt(0)){
     num++;
   }
 }
 for(int i=0;i<num;i++){
 if(c.charAt(i)==r.charAt(0)){
   a++;
 }
}
 System.out.println(a);
}
}
