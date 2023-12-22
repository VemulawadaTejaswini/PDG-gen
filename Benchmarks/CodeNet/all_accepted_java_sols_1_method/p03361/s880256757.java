import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		char k[][] = new char[h][w];
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			k[i] = s.toCharArray();
		}
boolean ans=true;
		for (int i = 0; i < h; i++) {
			for (int o = 0; o < w; o++) {
				if (k[i][o] == '#') {
					if (k[Math.min(i + 1, h-1)][o] == '.' && k[i][Math.min(o + 1,w-1)] == '.'
							&& k[Math.max(i - 1,0)][o] == '.' && k[i][Math.max(o - 1, 0)] == '.') {
ans=false;
break;
					}

				}
			}

		}
		if(ans){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}