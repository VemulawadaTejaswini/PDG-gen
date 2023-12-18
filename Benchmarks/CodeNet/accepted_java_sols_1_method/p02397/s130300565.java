import java.io.*;

class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true){
			String line[] = br.readLine().split(" ");
			int x = Integer.parseInt(line[0]);				
			int y = Integer.parseInt(line[1]);
			if(x == 0 && y == 0){
				break;
			}
			else{
				sb.append(Integer.toString(x < y ? x : y)).append(" ").append(Integer.toString(x < y ? y : x)).append("\n");
			}
		}
		System.out.print(sb);
	}
}