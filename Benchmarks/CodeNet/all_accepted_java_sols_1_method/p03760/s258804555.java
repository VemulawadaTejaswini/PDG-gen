
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		String out = "";
		int cnt=1;
		while(E.length()!=0 || O.length()!=0){
			if(cnt%2==0){
				out += E.charAt(0);
				E = E.substring(1);
			}
			else{
				out += O.charAt(0);
				O = O.substring(1);
			}

			cnt++;
		}
		System.out.println(out);

	}

}
