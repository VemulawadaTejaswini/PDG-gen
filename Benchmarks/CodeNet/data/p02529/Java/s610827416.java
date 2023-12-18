
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] search = new int[n];
		for(int i=0; i < n; i++){
			search[i] = sc.nextInt();
		}
		Arrays.sort(search);
		int m = sc.nextInt();
		int count =0;

		int patt = sc.nextInt();
		int temp = bLowerSearch(search, patt, 0, n-1);
		for(int i=19; i < m; i++){

			if(temp != -1){
				while(search[temp] == patt){
					count++;
					temp++;
				}
			}
			patt = sc.nextInt();
			temp = bLowerSearch(search, patt, 0, n-1);
		}
		System.out.println(count);

	}

	public int bLowerSearch(int num [], int patt, int left, int right){
		while(left < right){
			int mid = (right + left)/2;
			if(num[mid] < patt){
				left = mid +1;
			}
			else{
				right = mid;
			}
		}
		if(num[left] == patt){
			return left;
		}
		else{
			return -1;
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}