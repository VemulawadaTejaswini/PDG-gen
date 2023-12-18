import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int M = scan.nextInt();
                int K = scan.nextInt();
               
                ArrayList<Long> A = new ArrayList<>();
                ArrayList<Long> B = new ArrayList<>();
                for(int i=0; i<N;i++){
                        long P = scan.nextLong();
                        if(i==0){
                            A.add(P);
                        }else{
                            A.add(A.get(i-1)+P);
                        }
                }
                for(int i=0; i<M;i++){
                        long Q = scan.nextLong();
                        if(i==0){
                            B.add(Q);
                        }else{
                            B.add(A.get(i-1)+Q);
                        }
                }
                int ans = 0;
                int an = N-1;
                int bn = M-1;
                int i=0;
                while(i<=an&&A.get(i)<=K){
                    for(int j=bn; bn>=0;j--){
                        if(A.get(i)+B.get(j)<=K){
                            ans = Math.max(ans,i+j+2);
                            bn = j;
                            break;
                        }
                    }
                    i++;
                }

                System.out.println(ans);               
        }               
}