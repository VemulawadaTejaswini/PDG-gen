import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true){

			String[] line = br.readLine().split(" ");
			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);

			if(x == 0 && y == 0){
				break;
			}

			if(x <= y){
				sb.append(x + " " + y + "\n");
			}else{
				sb.append(y + " " + x + "\n");
			}

		}

		System.out.print(sb);

	}
}