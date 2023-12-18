import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextLine()){
				
				String s = sc.nextLine();
				if(s.equals("")) break;
				
				int JOI=0;
				int IOI=0;
				for(int i=0;i<s.length();i++) {
					if(s.indexOf("JOI",i)!=-1) {
						JOI++;
						i=s.indexOf("JOI",i)+1;
					}
				}
				
				for(int i=0;i<s.length();i++) {
					if(s.indexOf("IOI",i)!=-1) {
						IOI++;
						i=s.indexOf("IOI",i)+1;
					}
				}
		
				System.out.println(JOI);
				System.out.println(IOI);
			}
		}
	}

}


