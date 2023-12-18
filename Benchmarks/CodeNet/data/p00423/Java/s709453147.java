import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int size = 1;
		int A;
		int B;
		int i;
		int[] arr;
		Scanner scan = new Scanner(System.in);
		while(size != 0){
			A = 0;
			B = 0;
			if(scan.hasNext() == true){
				size = scan.nextInt();
			}
			arr = new int[size * 2];
			i = 0;
			while(i < 2 * size){
				if(scan.hasNext() ==  true){
					arr[i] = scan.nextInt();
					i++;
				}
			}
			i = 0;
			while(i < 2 * size){
				if(arr[i] < arr[i + 1]){
					B += (arr[i] + arr[i + 1]);
				}
				else if(arr[i] > arr[i + 1]){
					A += (arr[i] + arr[i + 1]);
				}
				else{
					A += arr[i];
					B += arr[i + 1];
				}
				i += 2;
			}
			System.out.println(A + " " + B);
		}
	}
}