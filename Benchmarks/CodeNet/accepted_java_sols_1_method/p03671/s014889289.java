import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int s1 = sc.nextInt();
   int s2 = sc.nextInt();
   int s3 = sc.nextInt();
   
   int[] aaa = {s1,s2,s3};
   Arrays.sort(aaa);
   System.out.println(aaa[1]+aaa[0]);
 }
}