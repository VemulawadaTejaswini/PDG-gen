import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kosu=sc.nextInt();

		if(kosu%2==0) {
			System.out.println((kosu/2)*(kosu/2));
		}
		else {
			System.out.println(((kosu+1)/2)*((kosu-1)/2));
		}
	}
}