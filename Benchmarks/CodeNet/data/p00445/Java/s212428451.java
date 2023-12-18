import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				String str = sc.next();
				int joi = 0;
				int ioi = 0;
				
				if(str.indexOf("JOI") == -1 && str.indexOf("IOI") == -1) {
					break;
				}else {
					for(int i=0; i<str.length()-2; i++) {
						String ss = str.substring(i,i+3);
						if(ss.equals("JOI")) {
							joi++;
							i++;
						}else if(ss.equals("IOI")) {
							ioi++;
							i++;
						}
					}
						
				}


				System.out.println(joi);
				System.out.println(ioi);
				
			}
			
			

			
		}
	}
}




