import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		for(int b = 1;b>0;b++){
			String r = scan.next();
			int tot = 0;
			if(r.equals("0")){
				break;
			}
			for(int a = 1; a<=r.length();a++){
				String k = r.substring(a-1,a);
				int K = Integer.parseInt(k);
				tot = tot + K;
			}
			System.out.println(tot);
		}
	}
}