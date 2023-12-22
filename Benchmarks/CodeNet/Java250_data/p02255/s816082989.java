import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{

	static int len;
	static int[] arr;

	//メインメソッド
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(reader.readLine());
		int[] arr = new int[len];
		//配列の要素数を1行目から読み取る

		String arrStr = reader.readLine();
        //2行目から配列の要素を読み取る
		StringTokenizer tokenizer = new StringTokenizer(arrStr," ");

		int i = 0;
		while(tokenizer.hasMoreElements()){
			arr[i++] = Integer.parseInt((String)tokenizer.nextElement());
		}
		reader.close();
        
        write(arr);
    
        
        //並べるメソッド
		sort(arr);
	}
	

	//引数は配列、返り値はなしでprintのみ。
	//ソートメソッド
	//printのタイミング・・？

	public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            //System.out.println(arr[j]);
			while(j>=0 && arr[j]>key){
				int change = arr[j];
				arr[j]=key;
				arr[j+1]=change;
                j--;
			}
			write(arr);
		}
	}
	
	public static void write(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}System.out.println(arr[arr.length-1]);
	}

}