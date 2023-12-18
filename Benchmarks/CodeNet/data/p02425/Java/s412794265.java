import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int q = sc.nextInt();
			long flags = 0;

			for(int k = 0; k < q; k++) {
				switch(sc.nextInt()) {
				case 0:{
					int i = sc.nextInt();
					System.out.println(flags>>i&1);
					break;
				}
				case 1:{
					int i = sc.nextInt();
					if((flags>>i&1)==0)
						flags += 1L<<i;
					break;
				}
				case 2:{
					int i = sc.nextInt();
					if((flags>>i&1)==1)
						flags -= 1L<<i;
					break;
				}
				case 3:{
					int i = sc.nextInt();
					if((flags>>i&1)==1)
						flags -= 1L<<i;
					else
						flags += 1L<<i;
					break;
				}
				case 4:
					System.out.println(flags == -1?1:0);
					break;
				case 5:
					System.out.println(flags != 0?1:0);
					break;
				case 6:
					System.out.println(flags == 0?1:0);
					break;
				case 7:{
					int cnt = 0;
					for(int j = 0; j < 64; j++) {
						if((flags>>j&1)>0)
							cnt++;
					}
					System.out.println(cnt);
					break;
				}
				case 8:
					System.out.println(Long.toUnsignedString(flags));
					break;
				}
			}
		}
	}
}
