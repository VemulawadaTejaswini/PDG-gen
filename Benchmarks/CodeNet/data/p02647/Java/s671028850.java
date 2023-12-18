import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int K = scan.nextInt();
                ArrayList<Integer> light = new ArrayList<>();
                ArrayList<Integer> ans = new ArrayList<>();
                ArrayList<Integer> ans2 = new ArrayList<>();
                for(int i=0; i<N; i++){
                    int A = scan.nextInt();
                    light.add(A);
                    ans.add(0);
                    ans2.add(0);
                }
                
                int kai = 0;
                while(kai<K){
                    for(int m=0; m<N;m++){
                        for(int j=-light.get(m); j<=light.get(m); j++){
                            if(0<=m+j && m+j<N){
                                ans.set(m+j,ans.get(m+j)+1);
                            }
                        }
                    }
                    
                    int cnt = 0;      
                    for(int k=0; k<N; k++){
                        if(ans.get(k)==N){
                            cnt++;
                        }
                        light.set(k, ans.get(k)-ans2.get(k));
                        ans2.set(k, ans.get(k));
                    }
                    if(cnt==N){
                        for(int k=0; k<N; k++){
                             System.out.print(light.get(k)+" ");
                          }
                        System.exit(0);
                    }
                    kai++;
                }
                for(int k=0; k<N; k++){
                    System.out.print(light.get(k)+" ");
                }
        }
}