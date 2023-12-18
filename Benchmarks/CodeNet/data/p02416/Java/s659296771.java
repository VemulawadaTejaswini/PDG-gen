import java.util.Scanner;

public class Main{
 public static void main(String[] args){
     Scanner sc =new Scanner(System.in);
     while(true){
         String line =sc.next();
         int n=line.length();
         int sum=0;
         if(line.equals("0"))break;
         
         for(int i=0; i<n; i++){
             char a =line.charAt(i);
             int b = a-'0';
             sum+=b;
         }
         System.out.println(sum);
         
         
         
         
     }
 }
}
