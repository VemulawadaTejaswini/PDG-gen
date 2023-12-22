import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int s = sc.nextInt();
				if(x+y+s == 0) break;
				
				int max = 0;
				for(int i=1; i<1000; i++) {
					for(int j=1; j<1000; j++) {
						if(Math.floor((i*(100+x)/100+j*(100+x)/100)) == s) {
							max = Math.max((int)Math.floor((i*(100+y)/100+j*(100+y)/100)), max);
						}
					}
				}
				System.out.println(max);
			}
		}
	}
}

