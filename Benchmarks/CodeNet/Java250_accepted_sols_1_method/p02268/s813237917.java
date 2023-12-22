import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int answer = 0;
		int n = Integer.parseInt(scanner.nextLine());
		int[] data1 = new int[n];
		for(int i = 0; i < n; i++){
			data1[i] = scanner.nextInt();
		}
		String nothing = scanner.nextLine();

		int q = Integer.parseInt(scanner.nextLine());
		int[] data2 = new int[q];
		for(int i = 0; i < q; i++){
			data2[i] = scanner.nextInt();
		}

		for(int i = 0; i < q; i++){
		    int left = 0;
    		int right = n;
    		int middle = 0;
			while(left < right){
				middle = (left + right) / 2;

				if(data1[middle] == data2[i]){
					answer ++;
				// 	System.out.println(data2[i]);
					break;
				}else if(data1[middle] > data2[i]){
					right = middle;
				}else{
					left = middle+1;
				}
			}
		}
		
		System.out.println(answer);

	}
}