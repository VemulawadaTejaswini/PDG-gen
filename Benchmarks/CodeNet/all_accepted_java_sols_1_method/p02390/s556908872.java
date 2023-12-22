import java.io.*;

class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int S = Integer.parseInt(br.readLine());
			System.out.println((S / 60 / 60) + ":" + ((S % (60 * 60))/ 60) + ":" + S % 60);
		}catch(Exception e){
		}
	}
}
