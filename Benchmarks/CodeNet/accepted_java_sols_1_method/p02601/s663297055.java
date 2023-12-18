

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int red=in.nextInt(),green=in.nextInt(),blue=in.nextInt();
			int K=in.nextInt();
			for(int i=0;i<K;i++) {
				if(blue<=green || blue<=red) {
					blue=blue*2;
				}else if(green<=red) {
					green*=2;
				}else {
					blue*=2;
				}
			}
			if(blue>green && green>red) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
