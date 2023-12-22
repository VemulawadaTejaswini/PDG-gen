import java.util.Scanner;
class Main{
	
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int c;
	int su=0;
	void rp4(){
	
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		for(int i=a; i<=b; i++){
			if(c%i==0) su++;
		}
		System.out.println(su);
	}
	
	public static void main(String[]agrs){
		new Main().rp4();
	}
}