import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args){

		String str = null;
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] str1;
		int a,b,c;

		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}
		
		boolean d = true;
		str1 = str.split(" ");
		a = Integer.parseInt(str1[0]);
		b = Integer.parseInt(str1[1]);
		c = Integer.parseInt(str1[2]);
		int e = 0;
		for(int i=a;i<=b;i++){
			
			if(c%i==0){
				e++;
				
			}
			
			
		}
		System.out.println(e);
	}
}