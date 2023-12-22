import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			boolean b;
			int c = a.length();
			char e;
			for(int d = 0 ; d < c ; d++){
				e = a.charAt(d);
				b = Character.isUpperCase(e);
				if(d!=c-1){
					if(b==true){
						System.out.print(Character.toLowerCase(e));
					}else{
						System.out.print(Character.toUpperCase(e));
					}
				}else{
					if(b==true){
						System.out.println(Character.toLowerCase(e));
					}else{
						System.out.println(Character.toUpperCase(e));
					}
				}
			}
	}

}