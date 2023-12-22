import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//?????°
		int num = Integer.parseInt(bf.readLine());
		
		//??????????´?
		int[] array = new int[num];
		
		//?????????
		String[] arrayString = bf.readLine().split(" ");
		
		for(int i=0;i<num;i++){
			array[i]=Integer.parseInt(arrayString[i]);
		}		
		selectionSort(array,num);
	}
	
	private static void selectionSort(int[] array, int num) {
		int count=0;
		for(int i=0;i<num;i++){
			int min=i;
			for(int j=i;j<num;j++){
				if(array[j]<array[min]){
					min=j;
				}
			}
			if(min!=i){
			int tmp=array[i];
			array[i]=array[min];
			array[min]=tmp;
			count++;
			}
		}
		
		for(int i=0;i<array.length;i++){
			System.out.printf("%d",array[i]);
			if(i!=array.length-1){
				System.out.printf(" ");
			}
		}
		System.out.println("");
		System.out.println(count);
	}
}