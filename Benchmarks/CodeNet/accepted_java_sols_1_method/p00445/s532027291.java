
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(101);
		while(sc.hasNext()){
			int JOI = 0;
			int IOI = 0;
			String s = sc.nextLine();
			if(s.equals("EOF"))break;
			for(int i=0;i<s.length()-1;i++) {
				if((s.indexOf("JOI",i)) != -1){
					i = s.indexOf("JOI", i);
					JOI++;
				}
			}
			for(int i=0;i<s.length()-1;i++) {
				if((s.indexOf("IOI", i)) != -1) {
					i = s.indexOf("IOI", i);
					IOI++;
				}
			}
			
			System.out.println(JOI);
			System.out.println(IOI);
		}
	}
}
