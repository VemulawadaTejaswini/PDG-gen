import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int p;
		double t;
		double[] r = new double[8];
		int[] c = new int[8];
		
		for(int i = 0; i < 8; i++){
			r[i] = 100;
		}
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 8; j++){
				p = scan.nextInt();
				t = scan.nextDouble();
				
				if(t < r[2 * i]){
					if(r[2 * i + 1] < r[6]){
						c[7] = c[6];
						r[7] = r[6];
						c[6] = c[2 * i + 1];
						r[6] = r[2 * i + 1];
					}else if(r[2 * i + 1] < r[7]){
						c[7] = c[2 * i + 1];
						r[7] = r[2 * i + 1];
					}
					c[2 * i + 1] = c[2 * i];
					r[2 * i + 1] = r[2 * i];
					c[2 * i] = p;
					r[2 * i] = t;
				}else if(t < r[2 * i + 1]){
					if(r[2 * i + 1] < r[6]){
						c[7] = c[6];
						r[7] = r[6];
						c[6] = c[2 * i + 1];
						r[6] = r[2 * i + 1];
					}else if(r[2 * i + 1] < r[7]){
						c[7] = c[2 * i + 1];
						r[7] = r[2 * i + 1];
					}
					c[2 * i + 1] = p;
					r[2 * i + 1] = t;
				}else if(t < r[6]){
					c[7] = c[6];
					r[7] = r[6];
					c[6] = p;
					r[6] = t;
				}else if(t < r[7]){
					c[7] = p;
					r[7] = t;
				}
			}
		}
		for(int k = 0; k < 8; k++){
			System.out.println(c[k] + " " + r[k]);
		}
	}
}