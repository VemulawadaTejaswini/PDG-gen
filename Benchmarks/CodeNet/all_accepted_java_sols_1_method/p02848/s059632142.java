import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        String S = sc.next();
 		byte[] Sbyte = S.getBytes("UTF-8");
      
        String text = "abc";      
      	String ans = "";      
 
      for(int i=0; i<S.length(); i++){
         int a=S.charAt(i) + key;
         if(a>=65+26)a-=26;
         ans = ans + String.valueOf((char)(a));
      }
         System.out.println(ans);
 
    }
}