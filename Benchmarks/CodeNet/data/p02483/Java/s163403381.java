import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int [] num = new int[3];
		//3ÂÌ®ðÇÝÞ
		for(int i = 0;i < 3;i++){
			num[i] = sc.nextInt();
		}
		//\[g·é
		insertSort(num);

		//oÍ·é
		for(int i=0;i<2;i++){
			System.out.print(num[i] + " ");
		}
		System.out.println(num[2]);
	}

	//}ü\[g
	private int[] insertSort(int[] array){
		int len = array.length;
		for (int i = 1;i<len;i++){
			int insertNum = array[i];
			int j;
			for(j = i;j >= 1; j--){
				if(array[j-1] < insertNum){
					break;
				}
				array[j] = array[j-1];
			}
			array[j] = insertNum;

		}
		return array;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}