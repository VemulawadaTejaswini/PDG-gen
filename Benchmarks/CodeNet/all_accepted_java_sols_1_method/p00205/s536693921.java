import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static int counter;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IN:while(true) {
			int[] tmp = new int[5];
			for(int i = 0; i < 5; i++) {
				tmp[i] = stdIn.nextInt();
				if(tmp[i] == 0) {
					return;
				}
			}
			boolean[] rps = new boolean[3];
			for(int i = 0; i < 5; i++) {
				rps[tmp[i]-1] = true;
			}
			int pp = 0;
			for(int i = 0; i < 3; i++) {
				if(rps[i]) {
					pp++;
				}
			}
			
			if(pp == 1 || pp == 3) {
				for(int i = 0; i < 5; i++) {
					System.out.println(3);	
				}
				continue IN;
			}
			
			else {
				if(rps[0] && rps[1]) {
					for(int i = 0; i < 5; i++) {
						if(tmp[i] == 1) {
							System.out.println(1);
						}
						else {
							System.out.println(2);
						}
					}
				}
				if(rps[0] && rps[2]) {
					for(int i = 0; i < 5; i++) {
						if(tmp[i] == 1) {
							System.out.println(2);
						}
						else {
							System.out.println(1);
						}
					}
				}
				if(rps[1] && rps[2]) {
					for(int i = 0; i < 5; i++) {
						if(tmp[i] == 2) {
							System.out.println(1);
						}
						else {
							System.out.println(2);
						}
					}
				}
			}
			
			
		}
	}
	

}