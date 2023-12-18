import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	char[] s_chars = sc.next().toCharArray();
      
      int count = 0;int memo  = 0;
      for(int i = 0;i < n;i++){
      	if(s_chars[i]=='I'){count++;}
        else{count--;}
        memo = Math.max(memo,count);
      }
		System.out.print(memo);
      
    }
}