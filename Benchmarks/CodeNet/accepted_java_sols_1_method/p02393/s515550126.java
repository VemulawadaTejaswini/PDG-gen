import java.util.*;

public class Main{

	public static void main(String[] args) throws java.io.IOException{
		int tmp;
		int[] x;
		x = new int[3];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			x[i] = in.nextInt();
		}
		for(int a = 2; a > 0; a--){
			for(int b = 0; b < a; b++){
				if(x[b] > x[b+1]){
					tmp = x[b];
					x[b] = x[b+1];
					x[b+1] = tmp;
				}
			}
		}
		System.out.println(x[0] + " " + x[1] + " " + x[2]);
	}
}