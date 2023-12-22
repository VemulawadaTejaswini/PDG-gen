import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long N = scan.nextLong();
                
                char[] alpha = new char[26];
                for(int i = 0; i < 26; i++){
                    alpha[i] = (char)(97 + i);
                }
                
                ArrayList<Character> ans = new ArrayList<>();
                while(N>=1){
                    long a = N%26;
                    int b = (int) a;
                    if(b!=0){
                        ans.add(alpha[b-1]);
                    }else if(b==0){
                        ans.add(alpha[25]);
                    }
                    
                    if(N%26!=0){
                        N=N/26;
                    }else{
                        N=N/26-1;
                    }
                }
                
                for(int i=ans.size()-1; i>=0; i--){
                    System.out.print(ans.get(i));
                }
        }
                
}
