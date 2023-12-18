import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args){
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));

		String str;
		
		try{
		while((str = reader.readLine()) != null){
			
			char[] ch = str.toCharArray();

			for(int i = 0; i < ch.length; i++){
				if(ch[i] == '@'){
					for(int j = 0; j < ch[i + 1] - '0'; j++)
						System.out.print(ch[i + 2]);
					i += 2;
				}else{
					System.out.print(ch[i]);
				}
			}
			System.out.println();
		}
		reader.close();
		}catch(IOException e){
		}
		}
}