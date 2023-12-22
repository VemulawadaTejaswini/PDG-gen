import java.util.Scanner;

class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextInt()){
				int a=Integer.parseInt(sc.next());
				int b=Integer.parseInt(sc.next());
				int digit = 1;
				int n=0;
				while((a+b)>=digit){
					digit=digit*10;
					n++;
				}
				System.out.println(n);
				
			}
		}
	}
}