import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String aabc=" ";
		int m;
		int sum;

		for (;!aabc.equals("-");){
			aabc = sc.next();
			if (aabc.equals("-")) break;

			char array[]= aabc.toCharArray();
			sum=0;
			m= sc.nextInt();

			for (int i=0;i<m;++i){
				sum = sum+ sc.nextInt();
			}
			for (int i=0;i<array.length;++i){
				System.out.print(array[(sum+i)%(array.length)]);
			}
			System.out.println();

		}


	}

}
