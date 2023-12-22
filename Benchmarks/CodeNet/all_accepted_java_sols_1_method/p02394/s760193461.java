import java.io.*;
class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] cut = input.split(" ");
		int w =	Integer.parseInt(cut[0]);
		int h =	Integer.parseInt(cut[1]);
		int x =	Integer.parseInt(cut[2]);
		int y =	Integer.parseInt(cut[3]);
		int r =	Integer.parseInt(cut[4]);
		
		if((x-r)<0 || (x+r)>w || (y-r)<0 ||(y+r)>h){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
		
		
		
	}
}