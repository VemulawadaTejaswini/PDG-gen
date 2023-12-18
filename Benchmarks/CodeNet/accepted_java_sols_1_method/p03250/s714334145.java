import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] intArray = Arrays.stream(sc.nextLine().split(" ")) //" "で区切ってString配列へ
    .mapToInt(Integer::parseInt) //数値にして
	.toArray(); //配列へ
		//計算
		if (intArray[0] >= intArray[1] && intArray[0] >= intArray[2]){
			// 出力
			System.out.println(intArray[0]*10 + intArray[1] + intArray[2]);
		}else if(intArray[1] >= intArray[0] && intArray[1] >= intArray[2]){
			// 出力
			System.out.println(intArray[1]*10 + intArray[0] + intArray[2]);
		}else{
			// 出力
			System.out.println(intArray[2]*10 + intArray[1] + intArray[0]);
		}

	}
}