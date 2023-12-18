import java.util.*;

class Main{
	Scanner scan = new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int count;
	public Main(){
		for(int i=a;i<=b;i++){
			if(c%i==0)count++;
		}
		System.out.println(count);
	}
	public static void main(String[]args){
		new Main();
	}
}