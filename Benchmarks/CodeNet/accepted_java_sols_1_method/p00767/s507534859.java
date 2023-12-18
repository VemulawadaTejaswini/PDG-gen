import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int h = stdIn.nextInt();
			int w = stdIn.nextInt();

			if(h==0&&w==0){
				return;
			}

			int size = h*h+w*w;
			int xh = Integer.MAX_VALUE;
			int xw = Integer.MAX_VALUE;
			int bestSize = Integer.MAX_VALUE;
			for(int i=1;i<=150;i++){
				for(int j=i+1;j<=150;j++){
					if(i==h&&j==w) continue;
					int now = i*i+j*j;
					if(size<now&&bestSize>now){
						xh = i;
						xw = j;
						bestSize = now;
					}
					else if(size==now&&bestSize>now&&i>h){
						xh = i;
						xw = j;
						bestSize = now;
					}
				}
			}
			System.out.println(xh+" "+xw);
		}

	}

}