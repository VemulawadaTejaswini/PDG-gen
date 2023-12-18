import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int e = stdIn.nextInt();
			if(e == 0) break;
			int max = 1000000;
			for(int i = 0; i <= e; i++) {
				for(int j = 0; i+j*j <= e; j++) {
					if(i + j * j > e) break;
					for(int k = 0; i+j*j+k*k*k <= e; k++) {
						if(i + j * j + k * k * k > e) {
							break;
						}
						if(i + j + k > max) {
							break;
						}
						if(i + j * j + k * k * k == e) {
							max = i + j + k;
						}
						
					}
				}
			}
			System.out.println(max);
		}
	}
}