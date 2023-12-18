
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int h,w,c;
		
		int[] height,width;
		
		while(true) {
			h = sc.nextInt();
			if(h == 0) {break;}
			w = sc.nextInt();
			c=0;
			
			height = new int[h+1];
			width = new int[w+1];
			
			height[0] = 0;
			width[0] = 0;
			
			for(int i=0;i<h;i++) {
				height[i+1] = height[i] + sc.nextInt();
			}
			for(int i=0;i<w;i++) {
				width[i+1] = width[i] + sc.nextInt();
			}
			//end input setting

			for(int h1=0;h1<h;h1++) {
				for(int h2=h1+1;h2<h+1;h2++) {
					
					for(int w1=0;w1<w;w1++) {
						for(int w2=w1+1;w2<w+1;w2++) {
							
							if(height[h2]-height[h1] == width[w2]-width[w1]) {
								c++;
							}
							
						}
					}
					
				}
			}
			
			System.out.println(c);
			
		}
		sc.close();
	}

}

