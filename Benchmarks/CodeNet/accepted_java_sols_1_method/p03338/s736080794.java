import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int ar[] = new int[26];
      	int br[] = new int[26];
      	int a_count;
      	int b_count;
      	int ans=0;
      	int count=0;
      	int ar_last[] = new int[26];
        int stack;
      	int num = sc.nextInt();
      	String str = sc.next();
      
      	for(int i = 0; i < 26;i++){
          ar[i] = 0;
          br[i] = 0;
        }
      	for(int i = 0; i < num;i++){
          stack = (int)str.charAt(i) - 97;
          ar[stack]++;
          ar_last[stack] = i;
        }     	
      
      	for(int i = 0; i < str.length();i++){
          stack = (int)str.charAt(i) - 97;
          if(br[stack] == 0){
          	if(ar[stack] > 1) {
              count++;
              if(count > ans) ans = count;
            } 
          }
          br[stack]++;
          ar[stack]--;
          if(ar[stack] == 0 && br[stack] != 1) count--;
        }
      	
      	System.out.println(ans);
        
	}
}
