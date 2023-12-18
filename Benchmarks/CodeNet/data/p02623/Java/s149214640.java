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
                int an = N;
                int bn = M;
                int i=0;
                while(i<=an&&A.get(i)<=K){
                    for(int j=bn; bn>=0;j--){
                        if(A.get(i)+B.get(j)<=K){
                            ans = Math.max(ans,i+j);
                            bn = j;
                            break;
                        }
                    }
                    i++;
                }

                System.out.println(ans);               
        }               
}