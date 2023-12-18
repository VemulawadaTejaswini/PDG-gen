import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		while (true) {
			String input = br.readLine();
			String cut[] = input.split(" ");
			int x = Integer.parseInt(cut[0]);
			int y = Integer.parseInt(cut[1]);
			if(x==0 && y==0){
				break;
			}
			else if (x < y) {
				sb.append(x + " " + y+"\n");
			} else if(x > y) {
				sb.append(y + " " + x+"\n");
			}
			else{
				sb.append(x +" "+y+"\n");
			}
		}
		System.out.print(sb);
	}
}