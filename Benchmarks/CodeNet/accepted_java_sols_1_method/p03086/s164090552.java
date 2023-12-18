import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
        String s = sc.next();
        int ans = 0;
        int count = 0;        
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='A'||s.charAt(i)=='T'||s.charAt(i)=='G'||s.charAt(i)=='C')
          {count++;}
          else{ans=Math.max(ans,count);
               count=0;}
        }	       
        System.out.println(Math.max(ans,count));
  }
}