import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 4;
		int obj[] = {1,7,9,4};
		int arr[] = new int[4];
		boolean judge[] = new boolean[4];
		for(int i = 0;i < 4; i++) {
			arr[i] = scan.nextInt();
			for(int j = 0;j< 4;j++) {
				if(arr[i] == obj[j]) {
					judge[j] = true;
					break;
				}
			}
		}
		
		boolean flag = true;
		for(int j = 0;j< 4;j++) {
			if(!judge[j]) {
				System.out.println("NO");
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("YES");
		}
	}
}