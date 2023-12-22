import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int maketime = sc.nextInt();
   int makecookie = sc.nextInt();
   int timelimit = sc.nextInt();
   int sum = 0;
   while(timelimit >= maketime)
   {
     timelimit -= maketime;
     sum += makecookie;
   }
    System.out.print(sum);
 }
}