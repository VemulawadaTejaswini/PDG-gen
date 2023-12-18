import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static int sum = 0;
	
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		String line = null;
		
		try {
			num = Integer.parseInt(br.readLine());
			line = br.readLine();
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		String[] str = line.split(" ");
		int array[] = new int[num];
		
		for(int i = 0; i < num; i ++ ){
			array[i] =Integer.parseInt(str[i]);
		}
		
		mergeSort(array, 0, num);
		
		
		for(int i = 0; i < num; i ++ ){
			System.out.print(array[i]);
			
			if(i < num - 1){
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		System.out.println(sum);
		
	}
	
	public static void mergeSort(int[] array, int left, int right){
		if(left + 1 < right){
			int middle = (left + right) / 2;
			mergeSort(array, left, middle);
			mergeSort(array, middle, right);
			merge(array, left, middle, right);
		}	
	}

	public static void merge(int[] array, int left, int middle, int right){
		int left_m = middle - left;
		int right_m = right - middle;
		int[] left_box = new int[left_m+1];
		int[] right_box = new int[right_m+1];
		for (int i=0; i<left_m; i++) {
			left_box[i] = array[left+i];
		}
		for (int i=0; i<right_m; i++) {
			right_box[i] = array[middle+i];
		}
		left_box[left_m] = Integer.MAX_VALUE;
		right_box[right_m] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k=left; k<right; k++) {
			sum ++;
			if (left_box[i] <= right_box[j]) {
				array[k] = left_box[i];
				i++;
			}else {
				array[k] = right_box[j];
				j++;
			}
		}
	}
}
