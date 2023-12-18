import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0;i<3;i++) arr[i] = scan.nextInt();
		for(int i=0; i < arr.length; i++) {
			for(int j=i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	}
}