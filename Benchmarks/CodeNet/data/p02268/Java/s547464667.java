import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] S = new int[n];
		String[] strArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			S[i] = Integer.parseInt(strArray[i]);
		}
		
		int q = Integer.parseInt(br.readLine());
		int[] T = new int[q];
		strArray = br.readLine().split(" ");
		for(int i = 0; i < q; i++){
			T[i] = Integer.parseInt(strArray[i]);
		}		
		
		int count = 0;
		for(int i = 0; i < T.length ; i++){
			//if(linearSearch(S, T[i]) != -1){
			if(binarySearch(S, T[i]) != -1){
				count++;
			}
		}
		System.out.println(count);
	}
	
	static int linearSearch (int[] array , int key){
		int result = -1;
		
		for(int i = 0; i < array.length ;i++){
			if(array[i] == key){
				return i;
			}
		}
		
		return result;
	}
	
	static int binarySearch(int[] array, int key){
		int left = 0;
		int right = array.length;
		int mid;
		
		while(left < right){
			mid = (left + right) / 2;
			if(array[mid] == key){
				return mid;
			}
			else if(key < array[mid]){
				right = mid;
			}
			else {
				left = mid + 1;
			}
		}
		
		return -1;
	}

}