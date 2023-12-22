import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int happy = 0;
      int cnt1 = 0;
      int cnt2 = 0;
      while(x>=500){
         cnt1++;
         x = x-500;
      }
      happy += 1000*cnt1;
      while(x>=5){
         cnt2++;
         x = x-5;
      }
      happy += 5*cnt2;
      System.out.println(happy);     
   }
}