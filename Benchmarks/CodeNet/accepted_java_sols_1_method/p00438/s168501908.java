import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line[] = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			if(a==0){break;}

			int road[][] = new int[a+1][b+1];
			road[1][1] = 1;

			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++){
				String cons[] = br.readLine().split(" ");
				road[Integer.parseInt(cons[0])][Integer.parseInt(cons[1])] = -1;
			}

			for(int i=1; i<=a; i++){
				for(int j=1; j<=b; j++){
					if(road[i][j]!=-1 && i*j!=1){
						road[i][j] = Math.max(0,road[i-1][j]) + Math.max(0, road[i][j-1]) ;
					}
				}
			}

			System.out.println(road[a][b]);
		}
	}
}