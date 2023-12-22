import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){	
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int sum = a+b;
			if(sum<10){
				System.out.println("1");
			}
			if(sum<100 && sum>9){
				System.out.println("2");
			}
			if(sum<1000 && sum>99){
				System.out.println("3");
			}
			if(sum<10000 && sum>999){
				System.out.println("4");
			}
			if(sum<100000 && sum>9999){
				System.out.println("5");
			}
			if(sum<1000000 && sum>99999){
				System.out.println("6");
			}
			if(sum<10000000 && sum>999999){
				System.out.println("7");
			}
		}
	}
}