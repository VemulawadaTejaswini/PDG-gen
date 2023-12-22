

import java.util.Scanner;

public class Main{ 
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			while(sc.hasNext()) {
				int h = sc.nextInt();
				int w = sc.nextInt();
				if(h+w==0)break;
				
				int taikaku = h*h+w*w;
				int min = 6000000;
				int ansh = 151;
				int answ = 151;
				
				for(int i=1;i<150;i++) {
					for(int j=i+1;j<=150;j++) {
						int tai = i*i+j*j;
						if(tai>=taikaku) {
							if(tai==taikaku && h>=i)
								continue;
							if(min > tai) {
								min = tai;
								ansh = i;
								answ = j;
							}

						}
					}
				}
				
				System.out.println(ansh +" "+answ);
			}
		}
	}
}

