import java.util.Scanner;

public class Main {
	int N, H, W;
	Scanner sc=new Scanner(System.in);

	public void run(){
		N=sc.nextInt();
		
		while (N-- != 0) {
			H=sc.nextInt();
			W=sc.nextInt();
			char[][] map=new char[30][30];
			
			int ph=-1,pw=-1;
			sc.nextLine();
			for(int h=0;h<H;h++){
				String s=sc.nextLine();
				map[h]=s.toCharArray();
				for(int w=0;w<W;w++) {
					if (map[h][w] == '^' || map[h][w] == '<' || map[h][w] == '>'
							|| map[h][w] == 'v') {
						ph=h;pw=w;
					}
				}
			}
			int M=sc.nextInt();sc.nextLine();
			String ops=sc.nextLine();
			for(int m=0;m<M;m++) {
				char op=ops.charAt(m);
				switch (op) {
				case 'S':
					switch (map[ph][pw]) {
					case '^':
						for (int h = ph - 1; h >= 0; h--) {
							if (map[h][pw] == '*') {
								map[h][pw] = '.';
								break;
							}
							if (map[h][pw] == '#') {
								break;
							}
						}
						break;
					case 'v':
						for (int h = ph + 1; h < H; h++) {
							if (map[h][pw] == '*') {
								map[h][pw] = '.';
								break;
							}
							if (map[h][pw] == '#') {
								break;
							}
						}
						break;
					case '<':
						for (int w = pw - 1; w >= 0; w--) {
							if (map[ph][w] == '*') {
								map[ph][w] = '.';
								break;
							}
							if (map[ph][w] == '#') {
								break;
							}
						}
						break;
					case '>':
						for (int w = pw + 1; w < W; w++) {
							if (map[ph][w] == '*') {
								map[ph][w] = '.';
								break;
							}
							if (map[ph][w] == '#') {
								break;
							}
						}
						break;
					}
					break;
				case 'U':
					map[ph][pw] = '^';
					if (ph >= 1 && map[ph - 1][pw] == '.') {
						map[ph][pw] = '.';
						map[ph - 1][pw] = '^';
						ph--;
					}
					break;
				case 'D':
					map[ph][pw] = 'v';
					if (ph < H - 1
							&& map[ph + 1][pw] == '.') {
						map[ph][pw] = '.';
						map[ph + 1][pw] = 'v';
						ph++;
					}
					break;

				case 'R':
					map[ph][pw] = '>';
					if (pw < W - 1
							&& map[ph][pw + 1] == '.') {
						map[ph][pw] = '.';
						map[ph][pw + 1] = '>';
						pw++;
					}
					break;
				case 'L':
					map[ph][pw] = '<';
					if (pw >= 1 && map[ph][pw - 1] == '.') {
						map[ph][pw] = '.';
						map[ph][pw - 1] = '<';
						pw--;
					}
					break;
				}
			}
			for(int h=0;h<H;h++){ 
				for(int w=0;w<W;w++){
					pr(map[h][w]);
				}
				ln();
			}
			if(N>0)ln();
		}

	}	
	public static void main(String[]_){
		new Main().run();
	}
	
	
	public static void pr(Object o){
		System.out.print(o);
	}
	
	public static void ln(Object o){
		System.out.println(o);
	}
	public static void ln(){
		System.out.println();
	}
}