import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		List<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0; i < num; i ++ ){
			array.add(scanner.nextInt());
		}
		
		

        System.out.println( count(array, 0, num) );
        
        scanner.close();
	}

	public static long merge(List<Integer> array, int left, int middle, int right) { 
		long count = 0;
		int sub_left,sub_right;
		int max = 1000000000;
		int i,j,k;
		
		//ソート処理
		sub_left = middle - left;
		sub_right = right - middle;
		List<Integer> array_left = new ArrayList<Integer>(sub_left + 1);
		List<Integer> array_right = new ArrayList<Integer>(sub_right + 1);
		
		for(i = 0;i < sub_left;i ++){
			array_left.add( array.get(left + i) );
		}
		
		for(i = 0;i < sub_right;i ++){
			array_right.add( array.get(middle + i) );
		}
		
		array_left.add(max);
		array_right.add( max);
		
		i = 0; j = 0;
		for(k = left;k < right;k ++){
			if(array_left.get(i) < array_right.get(j)) {
				//i ++;
				array.set(k, array_left.get(i ++));
			}else{
				//j ++;
				array.set(k, array_right.get(j ++));
				count += (sub_left - i);
			}
		}
		return count;
	}

	public static long count(List<Integer> array, int left, int right) { 
		int middle;
		if(left + 1 >= right){
			if(left < right)return 0;
			return 1;
		}else{
			middle = (left + right) / 2;
			return (count(array, left, middle) + count(array, middle, right) +
					merge(array, left, middle, right));
		}
	}
}

