import java.io.*;
import java.util.StringTokenizer;
public class InsertionSort {
    public static void insertSort(int[] arr){
        int i,j;
        for(i=1; i<arr.length; i++){
            int tmp = arr[i];
            for(j= i-1; j>=0; j--){
                if(arr[j] < tmp){
                    break;
                }
                arr[j+1] = arr[j];
            }
            arr[j+1] = tmp;
            for(int l=0; l<arr.length; l++){
                System.out.print(arr[l] + " ");
            }
            System.out.println("");
        }
    }
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] data = new int[n];
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
	    int i = 0;
	    while (tokenizer.hasMoreElements()) {
	    	data[i++] = Integer.parseInt((String) tokenizer.nextElement());
	    }
        for(i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
	    insertSort(data);
	}

}