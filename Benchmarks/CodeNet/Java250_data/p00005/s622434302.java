import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a=0,b=0,m=0,n=0,t=0;
		while(scan.hasNext()){
			a = scan.nextInt();
			b = scan.nextInt();
			if(a < b){
				m = b;
				n = a;
			}else{
				m = a;
				n = b;
			}
			while(true){
				if((t=m % n) == 0){
					break;
				}
				m = n;
				n = t;
			}
			System.out.println(n + " " + a/n*b);
		}
	}
}