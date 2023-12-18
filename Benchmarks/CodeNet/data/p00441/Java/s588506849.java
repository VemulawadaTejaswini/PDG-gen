import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;

			int[] x = new int[n];
			int[] y = new int[n];
			boolean[][] map = new boolean[5001][5001];

			for(int i=0; i<n; i++){
				String line[] = br.readLine().split(" ");
				x[i] = Integer.parseInt(line[0]);
				y[i] = Integer.parseInt(line[1]);
				map[x[i]][y[i]] = true;
			}

			int answer = 0;
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
					int xchange = x[j]-x[i];
					int ychange = y[j]-y[i];
					int s = xchange*xchange + ychange*ychange;
					if(s>answer){
						if(0 <= x[i]+ychange && x[i]+ychange <= 5000 && 0 <= y[i]-xchange && y[i]-xchange <= 5000 &&
							0 <= x[j]+ychange && x[j]+ychange <= 5000 && 0 <= y[j]-xchange && y[j]-xchange <= 5000){
						if(map[x[i]+ychange][y[i]-xchange] && map[x[j]+ychange][y[j]-xchange]){
							answer = s;
							break;
						}}else if(0 <= x[i]-ychange && x[i]-ychange <= 5000 && 0 <= y[i]+xchange && y[i]+xchange <= 5000 &&
								0 <= x[j]-ychange && x[j]-ychange <= 5000 && 0 <= y[j]+xchange && y[j]+xchange <= 5000){
						if(map[x[i]-ychange][y[i]+xchange] && map[x[j]-ychange][y[j]+xchange]){
							answer = s;
							break;
						}}
					}
				}
			}
			System.out.println(answer);
		}
	}
}