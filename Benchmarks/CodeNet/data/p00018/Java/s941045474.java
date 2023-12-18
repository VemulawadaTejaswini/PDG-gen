import java.util.Scanner;


public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("[\\s]+");
		int[] number = new int[5];

		for(int i=0;i<5;i++){
			number[i] = Integer.parseInt(s[i]);
		}

		for(int i=0;i<5;i++){
			for(int j=4;j>i;j--){
				if(number[j] > number[j-1]){
					int temp = number[j];
					number[j] = number[j-1];
					number[j-1] = temp;
				}
			}
		}
		for(int i=0;i<4;i++){
			System.out.print(number[i]+" ");
		}
		System.out.println(number[4]);
	}
}