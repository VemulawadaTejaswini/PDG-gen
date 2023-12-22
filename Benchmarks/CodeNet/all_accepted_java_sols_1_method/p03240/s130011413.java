import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int h[] = new int[n];
		
		int bx=0, by=0, bh=0;
		
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
			if(h[i]>0){
				bx = x[i];
				by = y[i];
				bh = h[i];
			}
		}
		
		for(int cx = 0;cx<=100;cx++){
			for(int cy=0;cy<=100;cy++){
				int H = bh + Math.abs(cx-bx) + Math.abs(cy-by);
				
				boolean f = true;
				for(int k=0;k<n;k++){
					if(Math.max(0, H-Math.abs(cx - x[k]) - Math.abs(cy - y[k])) != h[k]){
						f = false;
						break;
					}
				}
				
				if(f){
					System.out.println(cx+" "+cy+" "+H);
					return;
				}
			}
		}
		
	}

}
