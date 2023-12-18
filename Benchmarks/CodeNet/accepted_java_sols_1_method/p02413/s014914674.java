import java.io.*;

class Main {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] line = br.readLine().split(" ");
			int r = Integer.parseInt(line[0]);
			int c = Integer.parseInt(line[1]);
			int[][] r1 = new int[r][c];
			int sum2;

			for(int i = 0;i < r;i++){
				String[] str = br.readLine().split(" ");
				for(int j = 0;j < c;j++){
					r1[i][j] = 0;
					int a = Integer.parseInt(str[j]);
					r1[i][j] += a;
				}
			}
			for(int i = 0;i < r;i++){
				int sum = 0;
				for(int j = 0;j < c;j++){
					System.out.print(r1[i][j]+" ");
					sum += r1[i][j];
				}
				System.out.println(sum);
			}
			
			sum2 = 0;
			for(int j = 0;j < c;j++){
				int sum = 0;
				for(int i = 0;i < r;i++){
					sum += r1[i][j];
				}
				sum2 += sum;
				System.out.print(sum+" ");
				if(j == c-1){
					System.out.print(sum2);
				}		
			}
		System.out.print("\n");
		} catch (Exception e){
		}
	}
}