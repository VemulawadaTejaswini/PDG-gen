import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		 int n = readInt(r);
		 int[] s = strAryToIntAry(r.readLine().split(" "));
		 int q = readInt(r);
		 int[] t = strAryToIntAry(r.readLine().split(" "));

		 System.out.println(search(s, t));
	}

	public static int search(int[] s,int[] t){
		int sum = 0;
		for(int i = 0 ; i < t.length ; i++ ){
			if(binarySearch(s,t[i])) sum++;
		}
		return sum;
	}

	public static boolean binarySearch(int[] s,int key){
		int left = 0;
		int right = s.length - 1;
		int mid;
		while(left <= right){
			mid = (left+right)/2;
			if(key == s[mid]){
				return true;
			}else if(key < s[mid]){
				right = mid - 1;
			}else{
				left = mid + 1;
			}
		}
		return false;
	}

	public static int readInt(BufferedReader r) throws Exception{
        return Integer.parseInt(r.readLine());
    }

	public static int[] strAryToIntAry(String[] strAry){
		int arraySize = strAry.length;
		int[] intAry= new int[arraySize];
		for(int i = 0 ; i < arraySize ; i++){
			intAry[i] =Integer.parseInt(strAry[i]);
		}

		return intAry;
	}

}