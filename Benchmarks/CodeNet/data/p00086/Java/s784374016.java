import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string, str[];
		
		int a, b;
		while((string = reader.readLine()) != null){
			int data[] = new int[100];
			str = string.split(" ");
			a = Integer.valueOf(str[0]) - 1;
			b = Integer.valueOf(str[1]) - 1;
			data[a]++;
			data[b]++;
			
			while(!(string = reader.readLine()).equals("0 0")){
				str = string.split(" ");
				a = Integer.valueOf(str[0]) - 1;
				b = Integer.valueOf(str[1]) - 1;
				data[a]++;
				data[b]++;
			}
			
			a = 0;
			if(data[0] % 2 == 0 || data[1] % 2 == 0){
				a = 1;
			}else{
				for(int i = 2; i < 100; i++){
					if(data[i] % 2 == 1 && data[i] != 0){
						a = 1;
						break;
					}
				}
			}
			System.out.println(a == 0 ? "OK" : "NG");
		}
		reader.close();
	}
}