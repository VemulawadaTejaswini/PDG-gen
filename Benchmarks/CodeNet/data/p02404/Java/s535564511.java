import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;

		while(true){
			String str = br.readLine();
			String[] s = str.split(" ");

			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
			if((a == 0)&&(b == 0)){
				break;
			}
			if((3 <= a) &&(b <= 300)){

				for(int i = 0; i < a; i++){
					for(int j = 0; j < b; j++){
						if((i == 0) || (i ==(a - 1))){
							System.out.print("#");
						}else if((j == 0) || (j == (b - 1))){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}
}