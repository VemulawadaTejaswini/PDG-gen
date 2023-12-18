import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i;
		int size = 0;
		int[] arr;
		arr = new int[10];
		int left;
		int right;
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext() == true){
			size = scan.nextInt();
		}
		while(size > 0){
			i = 0;
			left = 0;
			right = 0;
			while(i < 10){
				if(scan.hasNext() ==  true){
					arr[i] = scan.nextInt();
					i++;
				}
			}
			i = 0;
			while(i < 10){
				if(arr[i] > left && arr[i] > right){
					if(left > right){
						left = arr[i];
					}
					else{
						right = arr[i];
					}
					i++;
				}
				else if(arr[i] > left){
					left = arr[i];
					i++;
				}
				else if(arr[i] > right){
					right = arr[i];
					i++;
				}
				else{
					break;
				}
			}
			if(i == 10){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			size--;
		}
	}
}