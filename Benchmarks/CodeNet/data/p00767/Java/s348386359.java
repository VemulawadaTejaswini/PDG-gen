import java.util.Scanner;

public class Main{
	static int check(int i,int j,int h,int w) {
		if(i*i+j*j == h*h+w*w) {
			return i-h;
		}else {
			return (i*i+j*j) - (h*h+w*w);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0 && w==0) break;
			int H = 150;
			int W = 150;
			for(int i=1;i<=150;i++) {
				for(int j=i+1;j<=150;j++) {
					if(check(i,j,h,w)>0 && check(i,j,H,W)<0) {
						H = i;
						W = j;
					}
				}
			}
			System.out.println(H+" "+W);
		}
	}
}

