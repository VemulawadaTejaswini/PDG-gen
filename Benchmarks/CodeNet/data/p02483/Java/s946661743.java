import java.util.Scanner;

class Main {
	Scanner sc;
	public void printH(int[] x){
		for(int i = 0; i < x.length - 1; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println(x[x.length-1]);
	}
	public void run(){
		sc = new Scanner(System.in);
		int[] x = new int[3];
		for(int i = 0; i < 3; i++){
			x[i] = sc.nextInt();
		}
		if(x[0] > x[1]){
			int y = x[0];
			x[0] = x[1];
			x[1] = y;
		}
		if(x[1] > x[2]){
			int y = x[1];
			x[1] = x[2];
			x[2] = y;
		}
		if(x[0] > x[1]){
			int y = x[0];
			x[0] = x[1];
			x[1] = y; 
		}
		printH(x);
	}
	public static void main(String[] args){
		new Main().run();
	}
}