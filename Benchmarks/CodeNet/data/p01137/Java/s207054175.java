import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int e = stdIn.nextInt();
			if(e == 0) break;
			int max = 1000000;
			for(int i = 0; i*i*i <= e; i++) {
				if(i >= max) break;
				for(int j = 0; i*i*i+j*j <= e; j++) {
					int k = e -(i * i * i + j * j);
					if(i + j + k < max) {
						max = i + j + k;
					}
				}
			}
			System.out.println(max);
		}
	}
}