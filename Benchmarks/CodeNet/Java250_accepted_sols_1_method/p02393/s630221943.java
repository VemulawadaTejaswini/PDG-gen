import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split(" ");

		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		if((a <= 10000) && (a >= 1) && (b <= 10000) && (b >= 1) && (c <= 10000) && (c >= 1)){

			if((b < c) && (a < c)){
				if(a > b){
					System.out.println(b +" "+ a +" "+ c);
				}else{
					System.out.println(a +" "+ b +" "+ c);
				}
			}else if((a < b)&&(c < b)){
				if(a > c){
					System.out.println(c +" "+ a +" "+ b);
				}else{
					System.out.println(a +" "+ c +" "+ b);
				}
			}else{
				if(b > c){
					System.out.println(c +" "+ b +" "+ a);
				}else{
					System.out.println(b +" "+ c +" "+ a);
				}
			}
		}
	}
}