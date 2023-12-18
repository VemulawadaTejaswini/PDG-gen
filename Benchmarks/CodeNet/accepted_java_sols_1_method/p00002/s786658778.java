import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int a = in.nextInt();
			int b = in.nextInt();
			int c = (int)Math.log10(a+b) + 1;
			System.out.println(c);
		}
	}
}