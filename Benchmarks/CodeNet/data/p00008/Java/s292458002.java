import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		int n = 0;
		int kotae = 0;
		try {
			String temp = br.readLine();
			if(temp==null)return;
			if(temp.length()==0)return;

			n = Integer.parseInt(temp);
			if(n>50)return;
		} catch (IOException e) {
			System.out.println("error");
		}
		if(n <= 36 ){
			for(int a=0;a<=9;a++){
				for(int b=0;b<=9;b++){
					for(int c=0;c<=9;c++){
						for(int d=0;d<=9;d++){
							if((a+b+c+d) == n){
								kotae++;
							}
						}
					}
				}
			}
		}
		System.out.println(kotae);
	}
}