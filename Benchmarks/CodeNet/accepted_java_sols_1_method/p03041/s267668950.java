import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int K=sc.nextInt()-1;

		String s=sc.next();

		String[] str=s.split("");

		for(int i=0;i<N;i++){
			if(i==K){
				str[i]=str[i].toLowerCase();
			}
			System.out.print(str[i]);
		}

		System.out.println();

		sc.close();

	}

}
