import java.util.Scanner;

class Main{	
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = 1;
		for(int i=2; i<=a&&i<=b ;i+=0){
			if(a%i==0 &&b%i==0){
				n *= i;
				a /= i;
				b /= i;
			}else{
				i++;
			}
		}
		System.out.println(n+" "+n*a*b);
		n=1;
		}
	
	}
} 