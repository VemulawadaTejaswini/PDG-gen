

public class Main {

	public static void main(String[] args) {
		System.out.println("start");
		int[] array = {1819,2003,876,2840,1723,1673,3776,2848,1592,922};
		array = arraySort(array);
		System.out.println(array[0]+"\n"+array[1]+"\n"+array[2]);
	}

	//配列を降順にソート
	public static int[] arraySort(int[] array){

		// 最後の要素を除いて、すべての要素を並べ替えます
	    for(int i=0;i<array.length-1;i++){

	    	// 下から上に順番に比較します
	    	for(int j=array.length-1;j>i;j--){

	    		// 上の方が大きいときは互いに入れ替えます
	    		if(array[j]>array[j-1]){
	    			int t=array[j];
	    			array[j]=array[j-1];
	    			array[j-1]=t;
	    		}
	    	}
	    }
		return array;
	}
}