import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[4];
		int[] t = new int[2];
		
		t[0] = sc.nextInt();
		s[0] = sc.nextInt();
		s[3] = sc.nextInt();
		s[1] = sc.nextInt();
		s[2] = sc.nextInt();
		t[1] = sc.nextInt();
		
		int q = sc.nextInt();
		
		for(int i = 0; i < q; i++) {
			int qt = sc.nextInt();
			int qf = sc.nextInt();
			
			for(int is = 0; is < 4; is++) {
				if(s[is] == qt) {
					if(s[(is+1)%4] == qf) {
						System.out.println(t[1]);
					}else if(s[(is+3)%4] == qf) {
						System.out.println(t[0]);
					}else if(t[0] == qf) {
						System.out.println(s[(is+1)%4]);
					}else {
						System.out.println(s[(is+3)%4]);
					}
				}
			}
			
			for(int is = 0; is < 4; is++) {
				if(s[is] == qf) {
					if(t[0] == qt) {
						System.out.println(s[(is+3)%4]);
					}else if(t[1] == qt){
						System.out.println(s[(is+1)%4]);
					}
				}
			}
			
		}
	}
}
