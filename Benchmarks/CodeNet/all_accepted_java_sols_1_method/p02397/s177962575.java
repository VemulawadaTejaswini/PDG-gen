import java.io.*;
 
class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder str = new StringBuilder();
		
		while(true){
			String temp[] = br.readLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			if(x == 0 && y == 0){
				break;
			}
			if(x>y){
				int tmp;
				tmp = x;
				x = y;
				y = tmp;
			}
			str.append(x + " " + y + "\n");
		}
		System.out.print(str);

	}
}