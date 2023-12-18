import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
		//System.out.println("Hello world");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br =new  BufferedReader(is);
		
		int[] n = new int[10];
		for(int i = 0; i <10; i++){
			String str = br.readLine();
			n[i] = Integer.parseInt(str);
		}
		int[] max = new int[3];
		max[2] = n[0];
		for(int i = 0; i <10; i++){
			if(max[2] <= n[i]){
				max[2] = n[i];
				if(max[2] >= max[1]){
					int re = max[1];
					max[1] = max[2];
					max[2] = re;
					if(max[1] >= max[0]){
						int re2 = max[0];
						max[0] = max[1];
						max[1] = re2;
					}
				}
			}
			
		}
		
		for(int i = 0; i <3; i++){
			System.out.println(max[i]);
		}
		
	}

}