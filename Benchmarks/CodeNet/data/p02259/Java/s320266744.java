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
		bubbleSort(array,num);
	}
	
	private static void bubbleSort(int[] array, int num) {
		boolean flag=true;
		int count=0;
		
		while(flag){
			flag=false;
			for(int i=num-1;i>=1;i--){
				if(array[i]<array[i-1]){
					int tmp=array[i];
					array[i]=array[i-1];
					array[i-1]=tmp;
					flag=true;
					count++;
				}
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