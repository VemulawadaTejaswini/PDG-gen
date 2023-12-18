import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int M = scan.nextInt();
                long K = scan.nextLong();
               
                ArrayList<Long> A = new ArrayList<>();
                ArrayList<Long> B = new ArrayList<>();
                A.add((long)0);
                B.add((long)0);
                for(int i=1; i<=N;i++){
                        long P = scan.nextLong();
                        A.add(A.get(i-1)+P);
                }
                for(int i=1; i<=M;i++){
                        long Q = scan.nextLong();
                        B.add(A.get(i-1)+Q);
                }
                int ans = 0;
                int bn = M;
                for(int i=0; i<=N&&A.get(i)<=K;i++){
                    for(int j=bn; j>=0;j--){
                        if(A.get(i)+B.get(j)<=K){
                            if(ans<i+j){
                                ans=i+j;
                            }
                            bn = j;
                            break;
                        }
                    }
                }
                System.out.println(ans);               
        }               
}