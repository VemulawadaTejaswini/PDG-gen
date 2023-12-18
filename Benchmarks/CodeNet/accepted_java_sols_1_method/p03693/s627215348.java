import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int s1 = sc.nextInt();
   int s2 = sc.nextInt();
   int s3 = sc.nextInt();
   if((10*s2+s3)%4==0)System.out.println("YES");
   else System.out.println("NO");
 }
}