import java.util.Scanner;
class newclass{
	int x;
	int y;
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n= sc.nextInt();
			if(n==0)break;
			newclass[] box = new newclass[n];
			for(int i=0;i<n;i++)
				box[i] = new newclass();
			
			box[0].x=0;
			box[0].y=0;
			
			int xx = 0;
			int xy = 0;
			int nx= 0;
			int ny = 0;
			for(int i=1;i<n;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(b==0) {
					box[i].x = box[a].x-1;
					box[i].y = box[a].y;
				}
				if(b==1) {
					box[i].y = box[a].y-1;
					box[i].x = box[a].x;
				}
				if(b==2) {
					box[i].x = box[a].x+1;
					box[i].y = box[a].y;
				}
				if(b==3) {
					box[i].y = box[a].y+1;
					box[i].x = box[a].x;
				}
				xx = Math.max(box[i].x,xx);
				xy = Math.max(box[i].y,xy);
				nx = Math.min(box[i].x,nx);
				ny = Math.min(box[i].y,ny);
			}
			int h = xx+1+Math.abs(nx);
			int w = xy+1+Math.abs(ny);
			System.out.println(h+" "+w);
			
		}
	}

}

