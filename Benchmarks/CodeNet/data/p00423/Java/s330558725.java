import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int size = 1;
		int A = 0;
		int B = 0;
		int i = 0;
		int[] arr;
		Scanner scan = new Scanner(System.in);
		while(size != 0){
			while(true){
				if(scan.hasNext() == true){
					A = 0;
					B = 0;
					size = scan.nextInt();
					break;
				}
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
					B += arr[i];
				}
				i += 2;
			}
			System.out.println(A + " " + B);
			System.out.println();
		}
	}
}