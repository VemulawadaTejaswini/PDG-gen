import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		int H = 0;
		int Cx = 0;
		int Cy = 0;
		boolean flag = false;
		for(int cx=0; cx<=100; cx++){
			for(int cy=0; cy<=100; cy++){
				flag = false;
				int index = 0;
				for(int i=0; i<n; i++){
					if(h[i]!=0){
						index = i;
					}
				}
				H = h[index] + Math.abs(x[index]-cx) + Math.abs(y[index]-cy);
				for(int i=0; i<n; i++){
					if(h[i] != Math.max(H - Math.abs(x[i]-cx) - Math.abs(y[i]-cy), 0)){
								flag = true;
								break;
					}
				}
				if(flag==false){
					Cy = cy;
					break;
				}
			}
			if(flag==false){
				Cx = cx;
				break;
			}
		}
		System.out.println(Cx + " " + Cy + " " + H);
	}
}