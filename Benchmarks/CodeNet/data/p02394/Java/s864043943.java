import java.io.*;

class Main {
	public static void main(String[] args){
		int W, H, x, y, r;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String[] line = br.readLine().split(" ");
			W = Integer.parseInt(line[0]);
			H = Integer.parseInt(line[1]);
			x = Integer.parseInt(line[2]);
			y = Integer.parseInt(line[3]);
			r = Integer.parseInt(line[4]);
			
			if( W >= (x+r) && H >= (y+r) && (y-r) >= 0 && (x-r) >= 0){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} catch(Exception e){
		}
	}
}
			