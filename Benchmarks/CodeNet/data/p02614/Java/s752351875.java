import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int H = scan.nextInt();
			int W = scan.nextInt();
			int K = scan.nextInt();

			char[][]c = new char[H][W];
			String []s = new String[H];

			for(int i = 0;i<H;i++) {
				s[i] = scan.next();
				c[i] = s[i].toCharArray();
			}

			int count = 0;

			for(int i = 0;i<(Math.pow(2, H));i++){
				for(int j = 0;j<(Math.pow(2, W));j++) {
					char[][]cha = new char[H][W];
					for(int k = 0;k<H;k++) for(int o = 0;o<W;o++)cha[k][o]=c[k][o];

					for(int w = 0;w<H;w++) {//行
						if((1&i>>w)==1) {
							for(int z = 0;z<W;z++)cha[w][z]='+';
						}
					}

					for(int w = 0;w<W;w++) {//列
						if((1&j>>w)==1) {
							for(int z = 0;z<H;z++)cha[z][w]='+';
						}
					}

					int co = 0;
					for(int h = 0;h<H;h++) {
						for(int e = 0;e<W;e++) {
							if(cha[h][e]=='#')co++;
						}
					}
					if(co==K)count++;
				}
			}

			System.out.println(count);




		}
	}
}
