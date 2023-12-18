import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;


class Main {
	private static	long array[];
	private static	int num;
	
	public static void main(String args[]) {
		//実行処理
		run();
	}
	
	//実質メイン
	public static void run(){ 
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();//要素数
		array = new long[num];
		long[] bubble = new long[num];
		//配列作成
		makeDeck(num,scanner);
		//ソート処理
		bubble = bubbleSort();
		quicksort(0, num - 1 );
		//出力
		if( Arrays.equals( bubble , array ) ) {
			System.out.println("Stable");
		}else {
			System.out.println("Not stable");
		}
		output();
		//後処理
		scanner.close();
	}
	
	//クイックソート
	public static void quicksort(int par, int rim){
		int q;
		if ( par < rim ){
			q = partition(par, rim);
			quicksort(par, q - 1);
			quicksort(q + 1, rim);
		}
	}
	
	//パーティション
	public static int partition(int par,int rim){
		long[] numArray = new long[num];
		long[] dig = new long[num];
		for(int i = 0; i < num; i ++){
			dig[i] = array[i] / 100000000;
			numArray[i] = array[i] % 100000000;
		}
		long work = 0;
		long sub = 0;
		long x = numArray[rim];
		int i = par - 1;
		
		//ソート処理
		for (int j = par ; j < rim ; j ++ ){
			if ( numArray[j] <= x ) {
				work = numArray[++i];
				numArray[i] = numArray[j];
				numArray[j] = work;
				sub = dig[i];
				dig[i] = dig[j];
				dig[j] = sub;
			}
		}
		//最後に入れ替え
		work = numArray[++i];
		numArray[i] = numArray[rim];
		numArray[rim] = work;
		sub = dig[i];
		dig[i] = dig[rim];
		dig[rim] = sub;
		for(int k = 0; k < num; k ++){
			array[k] = (dig[k] * 100000000)+  numArray[k];
		}
		return i;
	}
	
	//安定判断用バブルソート
	public static long[] bubbleSort(){ 
		long[] numArray = new long[num];
		long[] dig = new long[num];
		long[] out = new long[num];
		
		for(int i = 0; i < num; i ++)
		{
			dig[i] = array[i] / 100000000;
			numArray[i] = array[i] % 100000000;
		}
		//バブルソート処理
		for (int i = 0; i < num - 1; i++) {
				for (int j = num - 1; j > i; j--) {
					if (numArray[j - 1] > numArray[j]) {
						long work = numArray[j - 1];
						numArray[j - 1] = numArray[j];
						numArray[j] = work;
						long sub = dig[j - 1];
						dig[j - 1] = dig[j];
						dig[j] = sub;
					}
				}
			}
		for(int i = 0; i < num; i ++)
		{
			out[i] = (dig[i] * 100000000)+  numArray[i];
		}
		return out;
	}
	
	//山作り
	public static void makeDeck(int num, Scanner scanner){
		int count = 0;
		byte[] mark_num = new byte[100000000];
		byte[] trunp_byte = new byte[100000000];
		
		while( num > count ){
			String tranp = scanner.next();
			String num_trump = scanner.next();
			try {
				mark_num = tranp.getBytes("US-ASCII");
				trunp_byte = num_trump.getBytes("US-ASCII");
			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			//マーク数値化
			switch(getMark(mark_num[0]))
			{
			    case S:
			        array[count] = 100000000 + trunp_byte[0];
			        break;
			    case H:
			        array[count] = 200000000 + trunp_byte[0];
			        break;
			    case C:
			        array[count] = 300000000 + trunp_byte[0];
			        break;
			    case D:
			        array[count] = 400000000 + trunp_byte[0];
			        break;
			}
			count ++;
		}
	}
	
	//出力
	public static void output(){
		StringBuilder sb = new StringBuilder("");
		int mark;
		String trump_num = "";
		for (int i = 0; i < num; i++) {
			mark = (int) (array[i] / 100000000);
			byte[] sub = new byte[]{ (byte)(array[i] % 100000000) };
			
			try {
				trump_num = new String(sub, "US-ASCII");
			} catch (UnsupportedEncodingException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			//マークを判別
			switch( mark )
		    {
		        case 1:
					sb.append("S " + trump_num + "\n"); 
		            break;
		        case 2:
					sb.append("H " + trump_num + "\n"); 
		            break;
		        case 3:
					sb.append("C " + trump_num + "\n"); 
		            break;
		        case 4:
					sb.append("D " + trump_num + "\n"); 
		            break;
		    }
		}
		System.out.print(sb);
	}
	
    //enum宣言
	public static enum cardMarkNum
	{
        //マークをアスキーコードで紐づけ
		S(83),
		H(72),
		C(67),
		D(68);
		private final long mark;
		
		private cardMarkNum(final long mark) {
			this.mark = mark;
		}
		public long getInt(){
			return this.mark;
		}
	}
	public static cardMarkNum getMark(final long id) {
		cardMarkNum[] marks = cardMarkNum.values();
		for (cardMarkNum type : marks) {
			if (type.getInt() == id) {
				return type;
			}
		}
		return null;
	}
}
