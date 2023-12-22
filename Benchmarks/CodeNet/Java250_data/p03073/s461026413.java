import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int n = s.length();
      int cnt1 = 0;
      int cnt2 = 0;
      for(int i = 0;i < n;i+=2){
      	if(s.substring(i,i+1).equals("0"))cnt1++;
      }
      for(int i = 1;i < n;i+=2){
      	if(s.substring(i,i+1).equals("1"))cnt1++;
      }
      for(int i = 0;i < n;i+=2){
      	if(s.substring(i,i+1).equals("1"))cnt2++;
      }
      for(int i = 1;i < n;i+=2){
      	if(s.substring(i,i+1).equals("0"))cnt2++;
      }
      System.out.println(Math.min(cnt1,cnt2));
    }
}