import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int ans = 0;
		int[] length = new int[n]; 
		
		for(int i = 0; i < n; i++) {
			length[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					if(length[i] != length[j]
							&& length[i] != length[k]
							&& length[j] != length[k]
							&& length[i] + length[j] > length[k]
							&&	length[j] + length[k] > length[i]
							&& length[k] + length[i] > length[j]) {
						ans++;
					}
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}


