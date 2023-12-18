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
		int i = 1;
		int t = sc.nextInt();
		while(t != 0){
			System.out.println("Case" + i + ": " + t);
			i = i + 1;
			t = sc.nextInt();
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}