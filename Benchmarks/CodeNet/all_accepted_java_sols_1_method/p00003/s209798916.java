import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			int i = Integer.parseInt(br.readLine());
			for(;i>0;i--){
				String[] abc = br.readLine().split(" ");
				int a = Integer.parseInt(abc[0]);
				int b = Integer.parseInt(abc[1]);
				int c = Integer.parseInt(abc[2]);
				if(a*a+b*b==c*c||b*b+c*c==a*a||c*c+a*a==b*b){
					System.out.println("YES");
				} else System.out.println("NO");
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}