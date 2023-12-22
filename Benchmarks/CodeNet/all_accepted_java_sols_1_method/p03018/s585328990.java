import java.util.Scanner;
public class Main {
    public static void main(String[] $) {
       Scanner sc = new Scanner(System.in);
       long cnt=0,ans=0;
       String s=sc.next();
       s=s.replace("BC", "D");
       for(int i=0;i<s.length();i++) {
    	   String s2=s.substring(i, i+1);
    	   if(s2.equals("A"))cnt++;
    	   else if(s2.equals("D"))ans+=cnt;
    	   else cnt=0;
       }
       System.out.println(ans);
    }
   }