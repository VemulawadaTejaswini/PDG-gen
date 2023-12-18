import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] strArray;
		int c,k,s;

		while(true){

			str = br.readLine();
			if(str.equals("-1 -1 -1"))
				break;

			strArray = str.split(" ");

			c = Integer.parseInt(strArray[0]);
			k = Integer.parseInt(strArray[1]);
			s = Integer.parseInt(strArray[2]);

			if(c == -1 || k == -1){
				System.out.println("F");
			}else{
				if((c+k) >= 80){
					System.out.println("A");
				}else if((c+k) >= 65 && (c+k) < 80){
					System.out.println("B");
				}else if((c+k) >= 50 && (c+k) < 65){
					System.out.println("C");
				}else if((c+k) >= 30 && (c+k) < 50){
					if(s >= 50){
						System.out.println("C");
					}else{
						System.out.println("D");
					}
				}else{
					System.out.println("F");
				}
			}
		}
	}
}