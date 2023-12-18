import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int a[] = new int[N];
			for(int j=0; j<N; j++){
				a[j] = sc.nextInt();
			}
			Arrays.sort(a);
			
			int desOrder[] = new int[N];
			for(int j=0; j<N; j++){
				desOrder[N-j-1] = a[j];
			}
			int AliceScore = 0;
			int BobScore = 0;
			for(int j=0; j<N; j++){
				if(j%2==0){
					AliceScore = AliceScore+desOrder[j];
				}else{
					BobScore = BobScore+desOrder[j];
				}
			}
			System.out.println(AliceScore-BobScore);
		}
}
