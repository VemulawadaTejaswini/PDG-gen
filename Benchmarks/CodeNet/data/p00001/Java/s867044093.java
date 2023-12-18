import java.io.*;

public class Main{
	
	private static int[] mountains = new int[10];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<10;i++){
			mountains[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(mountains);
		
		for(int i=9;i > 6;i++){
			System.out.println(mountains[i]);
		}
	}

}