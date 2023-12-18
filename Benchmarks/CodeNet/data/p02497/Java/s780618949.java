import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		
		while(true){
			if(sc2.hasNextLine()){
				String[] s = sc2.nextLine().split("[\\s]+");
				int m = Integer.parseInt(s[0]);
				int f = Integer.parseInt(s[1]);
				int r = Integer.parseInt(s[2]);
				int n = m+f;
				
				if(m == -1 && f == -1 && r == -1) break;
				else{
					if((m|f)==-1)System.out.println("F");
					else if(n >= 80)System.out.println("A");
					else if(n<80 && n>=65)System.out.println("B");
					else if(n<65 && n>=50)System.out.println("C");
					else if(n<50 && n>=30){
						if(r>=50) System.out.println("C");
						else{System.out.println("D");}
					}
					else if(n<30)System.out.println("D");
				}
			}else{break;}
		}
	}
}