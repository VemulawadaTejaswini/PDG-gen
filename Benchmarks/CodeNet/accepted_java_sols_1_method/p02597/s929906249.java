import java.util.*; 
import java.lang.*; 


public class Main{
    
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                String call = scan.next();
                char[] c = new char[N];
                
                for(int i=0; i<N; i++){
                    c[i] = call.charAt(i);
                }
                
                int l = 0;
                int r = N-1;
                
                int cnt = 0;
                
                while(l<r){
                    while(c[l]=='R' && l<r){
                        l++;
                    }
                    while(c[r]=='W' && l<r){
                        r--;
                    }
                    
                    if(c[l]=='W' && c[r]=='R'){
                        c[l]='R';
                        c[r]='W';
                        cnt++;
                        l++;
                        r--;
                    }
                }
                
                System.out.println(cnt);
        }
}