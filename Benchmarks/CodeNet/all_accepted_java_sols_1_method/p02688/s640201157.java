import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int K = scan.nextInt();
                int[] d = new int[K+1];
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                
                for(int i=1; i<=K;i++){
                    d[i] = scan.nextInt();
                        for(int j=1; j<=d[i];j++){
                            int[][] A = new int[K+1][d[i]+1];
                            A[i][j] = scan.nextInt();
                            arrayList.add(A[i][j]);
                        }
                }
                
                ArrayList<Integer> listB = new ArrayList<Integer>(new HashSet<>(arrayList));

                System.out.println(N-listB.size());
      
        }
}