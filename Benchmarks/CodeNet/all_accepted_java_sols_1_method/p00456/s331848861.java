import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int w = 0, k = 0;
		int[] topW, topK;
		topW = new int[3];
		topK = new int[3];
		
		for(int i = 0; i < 10; i++){
			n = scan.nextInt();
			if(n > topW[0]){
				topW[2] = topW[1];
				topW[1] = topW[0];
				topW[0] = n;
			}else if(n > topW[1]){
				topW[2] = topW[1];
				topW[1] = n;
			}else if(n >topW[2]){
				topW[2] = n;
			}
		}
		for(int i = 0; i < 3; i++){
			w += topW[i];
		}
		
		for(int i = 0; i < 10; i++){
			n = scan.nextInt();
			if(n > topK[0]){
				topK[2] = topK[1];
				topK[1] = topK[0];
				topK[0] = n;
			}else if(n > topK[1]){
				topK[2] = topK[1];
				topK[1] = n;
			}else if(n >topK[2]){
				topK[2] = n;
			}
		}
		for(int i = 0; i < 3; i++){
			k += topK[i];
		}
		
		System.out.println(w + " " + k);
	}
}