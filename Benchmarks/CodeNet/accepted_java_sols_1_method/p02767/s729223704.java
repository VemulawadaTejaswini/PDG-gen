import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[]=new int[N+1];
		for(int i=1;i<=N;i++){
			X[i]=sc.nextInt();
		}
		int Max = Integer.MIN_VALUE;
		int Low = Integer.MAX_VALUE;
		int HP = 0;
		for(int i=1;i<=100;i++){
			HP=0;
			for(int j=1;j<=N;j++){
				HP=HP+(i-X[j])*(i-X[j]);
			}
			if (Max < HP) {Max=HP;
			}
			if (Low > HP) {Low=HP;
			}
		}
		System.out.println(Low);
        }
    }