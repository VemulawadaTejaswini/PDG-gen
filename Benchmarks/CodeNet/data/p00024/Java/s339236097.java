
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			String str = stdIn.nextLine();
			if(str==null){
				break;
			}
			double v = Double.parseDouble(str);
			int i = 1;
			
			while(true){
				double t = Math.sqrt((5*i-5)/4.9);
				double v1 = 9.8*t;
				if(v1>=v){
					System.out.println(i);
					break;
				}
				i++;
			}
			
		}
	}
}