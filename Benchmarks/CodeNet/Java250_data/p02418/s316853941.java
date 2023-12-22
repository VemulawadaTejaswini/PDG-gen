import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			String b = sc.next();
			a=a+a;
			int c = a.length();
			int d = b.length();
			String f;
			boolean g=false;
			for(int e=0;e<c-d;++e){
				f=a.substring(e,e+d);
				if(b.equals(f)){
					g=true;
					break;
				}
			}
			if(g){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
	}

}