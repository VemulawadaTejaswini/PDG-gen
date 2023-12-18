import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		String[] str;
		int m,f,r;
		String s;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		while(true){
			str = br.readLine().split(" ");
			m = Integer.parseInt(str[0]);
			f = Integer.parseInt(str[1]);
			r = Integer.parseInt(str[2]);
			if(m==-1&&f==-1&&r==-1)break;
			if(m==-1||f==-1){
				s="F";
			}else if(m + f < 30){
				s="F";
			}else if(m + f < 50){
				if(r >= 50){
					s="C";
				}else{
					s="D";
				}
			}else if(m + f < 65){
				s ="C";
			}else if(m + f < 80){
				s = "B";
			}else{
				s = "A";
			}
			System.out.println(s);
		}

		br.close();
	}
}