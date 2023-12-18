import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int q, order_num, i, j, n = 0, counter;
		boolean[] flag = new boolean[64];
		StringBuilder str = new StringBuilder();
		try (Scanner sc = new Scanner(System.in)) {
			q = sc.nextInt();
			for(j = 0; j < q; j++) {
				order_num = sc.nextInt();
				if(order_num <= 3) {
					n = sc.nextInt();
				}
				switch(order_num) {
				case 0 : System.out.println(flag[n] ? "1" : "0"); break;
				case 1 : flag[n] = true; break;
				case 2 : flag[n] = false; break;
				case 3 : flag[n] = !flag[n]; break;
				case 4 :
					counter = 1;
					for(i = 0; i < 64; i++) {
						if(flag[i] != true) {
							counter = 0;
							break;
						}
					}
					System.out.println(counter); break;
				case 5 :
					counter = 0;
					for(i = 0; i < 64; i++) {
						if(flag[i] != false) {
							counter = 1;
							break;
						}
					}
					System.out.println(counter); break;
				case 6 :
					counter = 1;
					for(i = 0; i < 64; i++) {
						if(flag[i] == true) {
							counter = 0;
							break;
						}
					}
					System.out.println(counter); break;
				case 7 :
					counter = 0;
					for(i = 0; i < 64; i++) {
						if(flag[i] == true) {
							counter++;
						}
					}
					System.out.println(counter); break;
				case 8 :
					for(i = 0; i < 64; i++) {
						str.append(flag[i] ? 1 : 0);
					}
					str.reverse();
					System.out.println(Long.parseUnsignedLong(str.toString(), 2));
				}
			}
		}
	}
}

