import java.util.Scanner;

public class Main {
  	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];

		for(int i = 0;i<3;i++){

			a[i] = sc.nextInt();

		}

		int sum = 0;

		if(a[0] == a[1]){
			sum++;
		}

		if(a[0] == a[2]){
			sum++;
		}

		if(a[1] == a[2]){
			sum++;
		}

		if(sum == 1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}


	}

}