import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextDouble()){
			double a = sc.nextDouble();
			double x = a * 2;
			a += x;
			for(int i = 3; i <= 10; i++){
				if(i % 2 == 0){
					x = x * 2;
					a += x;
				}else{
					x = x / 3;
					a += x;
				}
			}
			System.out.println(a);
		}
		sc.close();
	}
}