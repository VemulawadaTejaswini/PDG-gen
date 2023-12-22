import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int turn = Integer.parseInt(br.readLine());
		int p1 = 0,p2 = 0;
		for(int i=0; i<turn; i++){
			String[] ani = br.readLine().split(" ");
			if(ani[0].compareToIgnoreCase(ani[1]) > 0){
				p1 += 3;
			}
			else if(ani[0].compareToIgnoreCase(ani[1]) ==0){
				p1 += 1;
				p2 += 1;
			}
			else if(ani[0].compareToIgnoreCase(ani[1]) < 0){
				p2 += 3;
			}
		}
		System.out.println(p1+" "+p2);
	}
}