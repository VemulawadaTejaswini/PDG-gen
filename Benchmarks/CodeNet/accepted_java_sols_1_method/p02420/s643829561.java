import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			while(a==a){
				int b = sc.nextInt();
				int c = a.length();
				for(int d=0;d<b;++d){
					int e = sc.nextInt();
					String f = a.substring(0,e);
					String g = a.substring(e,c);
					a = g+f;
				}
				System.out.println(a);
				a = sc.next();
				if(a.equals("-")){
					break;
				}
			}
	}

}