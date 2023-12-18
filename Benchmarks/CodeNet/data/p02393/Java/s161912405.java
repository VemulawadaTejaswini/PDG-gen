import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] number = new int[3];
		for(int i=0; i<3; i++){
				number[i] = in.nextInt();	
		}

		number = bubbleSort(number);
		System.out.println(number[0]+" "+number[1]+" "+number[2]);
	}

	public static int[] bubbleSort(int[] number){
		for(int i=0; i<number.length-1; i++){
			for(int j=0; j<number.length-1; j++){
				if(number[j] > number[j+1]){
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		return number;
	}
}