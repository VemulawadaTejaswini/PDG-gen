
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		int b = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<b;i++){
			String[] c = scanner.nextLine().split(" ");
			int d = Integer.parseInt(c[1]);
			int e = Integer.parseInt(c[2])+1;
			if(c[0].equals("print")){
				System.out.println(a.substring(d,e));
			}else if(c[0].equals("reverse")){
				StringBuffer stringBuffer = new StringBuffer(a.substring(d, e));
				StringBuffer gyaku  = stringBuffer.reverse();
				a = a.substring(0,d) +gyaku.toString()+a.substring(e);
			}else{
				a= a.substring(0,d)+c[3] +a.substring(e);
			}
			
		}
	}}