import java.util.*;

class Main{
	Scanner scan = new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	public Main(){
		int d=a/b;
		int r=a%b;
		float f=(float)a/b;
		System.out.println(d+" "+r+" "+f);
	}
	public static void main(String[] args){
		new Main();
	}
}