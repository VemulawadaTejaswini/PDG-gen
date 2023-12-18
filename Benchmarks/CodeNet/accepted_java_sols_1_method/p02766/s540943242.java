import java.util.Scanner;
class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int k = sc.nextInt();
   String a = Integer.toString(n, k);
   int l = a.length();

   System.out.println(l);
 }
}