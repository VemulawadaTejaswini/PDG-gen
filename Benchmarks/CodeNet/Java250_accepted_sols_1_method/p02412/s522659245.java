import java.io.*;

class Main {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			int n, x;
			while(true){
				String buf = br.readLine();
				String[] line = buf.split(" ");
				n = Integer.parseInt(line[0]);
				x = Integer.parseInt(line[1]);
				if(n == 0 && x == 0)break;
			

			int count = 0;
			for(int i= 1;i <= n-2;i++){
				for(int j = i+1; j <=n-1;j++){
					for(int k = j+1; k <=n;k++){
						if(i + j + k == x){
							count += 1;
						}
					}
				}
			}
			System.out.println(count);
			}
		}catch (Exception e){
		}
	}
}
				