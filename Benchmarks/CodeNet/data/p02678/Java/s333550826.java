import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // room#
		int M = sc.nextInt(); // path#

      	Integer[][] Ngraph = new Integer[N][N];
		for(int i=0; i<N; i++){
          for(int j=0; j<N; j++){
			Ngraph[i][j]=0;
          }
		}

		Set<Integer> doneSet = new HashSet<Integer>();
		doneSet.add(1);

		Integer[] ans = new Integer[N];
		Arrays.fill(ans, 0);
		ans[0] = 1;
		
		for(int i=0; i<M; i++){
			int tmp1 = sc.nextInt();
			int tmp2 = sc.nextInt();
			
			Ngraph[tmp1-1][tmp2-1] = 1;
			Ngraph[tmp2-1][tmp1-1] = 1;
		}
   	
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if((i!=j)&&!doneSet.contains(j+1)){
					if(Ngraph[i][j]==1){
                      	if(ans[j]==0){
							ans[j] = i+1;
                            doneSet.add(j+1);
                            continue;
                        }
						
                      	if(ans[j]>i+1){
							ans[j] = i+1;
                        }
						doneSet.add(j+1);
					}
					
				}
			}
		}

		if(doneSet.size() != N){
			System.out.println("No");
			return;
		}

		System.out.println("Yes");
		for(int i=1; i<N; i++){
			System.out.println(ans[i]);
		}
		return;

	}
}