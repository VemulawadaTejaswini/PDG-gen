import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner stdIn = new Scanner (System.in);
		int i,j,tmp;
		int[] a = new int[3];
		for(i = 0; i < a.length; i++){
			a[i] = stdIn.nextInt();
		}
		for(i = 0; i < a.length-1; i++){
			for(j = i+1; j < a.length; j++){
				if(a[i] > a[j]){
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}

			}
		}

		for(i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
                System.out.println(" ");
	}

}