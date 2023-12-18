import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int K = scan.nextInt();
                ArrayList<Integer> light = new ArrayList<>();
                ArrayList<Integer> ans = new ArrayList<>();
                for(int i=0; i<N; i++){
                    int A = scan.nextInt();
                    light.add(A);
                    ans.add(0);
                }
                
                for(int i=0; i<45; i++){
                    for(int j=0; j<N; j++){
                        int l = Math.max(0,j-light.get(j));
                        int k = Math.min(N-1,j+light.get(j));
                        ans.set(l, ans.get(l)+1);
                        if(k+1<N){
                            ans.set(k+1, ans.get(k+1)-1);
                        }  
                    }
                    
                    for(int j=1;j<N;j++) {
                        ans.set(j, ans.get(j-1)+ans.get(j));
                    }
                    }
        System.out.println(ans);
        
        }
}