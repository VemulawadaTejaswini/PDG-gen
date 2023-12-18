import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int s1 = sc.nextInt();
   int s2 = sc.nextInt();
   int s3 = sc.nextInt();
   
   boolean seven = false;
   if(s1==7||s2==7||s3==7) seven =true;
   
   boolean five = false;
   if(s1==5&&s2==5||s2==5&&s3==5||s3==5&&s1==5) five = true;
 
   if(seven&&five) System.out.println("YES");
   else System.out.println("NO");
 }
}