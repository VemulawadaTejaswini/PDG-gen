import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test {
	public static void main(String[] args) throws IOException{
		int[] data =new int[10];
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		for(int i =0;i<10;i++){
			String str= buf.readLine();
			data[i]=Integer.parseInt(str);
			}

		quicSort(data,0,data.length -1);

		System.out.println(data[9]);
		System.out.println(data[8]);
		System.out.println(data[7]);

	}

	public static void quicSort(int[] array,int farst,int last) {
		int asc = farst+1;					//配列の最初の次の要素
		int desc = last;					//配列の最後
		int temp =0;						//配列交換用
		while (asc < desc) {
			//配列の最初から進み基準値より小さい間ループ
			while (array[asc]<array[farst] && asc< last) {
				asc++;
			}
			//配列の最後から進み基準値より大きい間ループ
			while (array[desc]>=array[farst] && desc > farst) {
				desc--;
			}


			//前半にある小さい要素と後半にある大きい要素を交換
			if (asc < desc) {
				temp = array[asc];
				array[asc] = array[desc];
				array[desc] = temp;
			}

		}
			//基準値を真ん中の要素と交換
			temp = array[farst];
			array[farst] = array[desc];
			array[desc] = temp;



		if (farst < desc-1) {
			quicSort(array, farst, desc -1);
		}
		if (desc+1 < last) {
			quicSort(array, desc + 1,last);
		}

	}
}