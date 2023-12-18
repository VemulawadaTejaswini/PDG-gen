import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int o=0;
       int n=sc.nextInt();
       String s=sc.next();
     for(int i=0;i<n-2;i++){
     	if(s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C')o++;
     }
      System.out.println(o);
    }
}