import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while((str = reader.readLine()) != null){
			String[] code = str.split(",",0);
			int sum = 0;
			
			int[] station = new int[12];
			for(int i = 0; i < 10; i++){
				station[i] = Integer.parseInt(code[i]);
				sum += station[i];
			}
			int v1 = Integer.parseInt(code[10]);
			int v2 = Integer.parseInt(code[11]);
			double x = 0,s = 0;
			for(int i = 0; i < 10; i++){
				x += station[i];
				s = x / v1;
				if(x + s * v2 >= sum){
					System.out.println(i + 1);
					break;
				}
				}
			}
		reader.close();
	}
}