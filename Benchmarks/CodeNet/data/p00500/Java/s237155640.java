
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i, k, searched, search;
		int[][] data = new int[N][3];
		int[] point = new int[N];

		for(i = 0; i < N; i++){
			for(k = 0; k < 3; k++){
				data[i][k] = sc.nextInt();
			}
		}

		for(i = 0; i < N; i++){
			for(k = 0; k < 3; k++){
				search = data[i][k];
				for(searched = 0; searched < N; searched++){
					if(i == searched)continue;
					if(search == data[searched][k])search = 0;
					if(search == 0)break;
				}
				point[i] += search;
			}
		}


		for(i = 0; i < N; i++){
			System.out.println(point[i]);
		}
	}
}