import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			a=a.toLowerCase();
			String b = sc.next();
			b=b.toLowerCase();
			int c=0;
			while(a==a){
				if(a.equals(b)){
					c=c+1;
				}
				b=sc.next();
				if(b.equals("END_OF_TEXT")){
					break;
				}
				b=b.toLowerCase();
			}
			System.out.println(c);
	}

}