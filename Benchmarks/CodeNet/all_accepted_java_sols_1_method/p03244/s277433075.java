import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] v = new int[n];
		int[] odd = new int[100001];
		int[] even = new int[100001];
		for(int i = 0; i < n; i++){
		    v[i] = sc.nextInt();
		    if(i%2 == 0){
		        odd[v[i]]++;
		    }else{
		        even[v[i]]++;
		    }
		}

		// 計算
		int result = 0;
		int oddFirstId = -1;
		int oddFirst = 0;
		int oddSecondId = -1;
		int oddSecond = 0;
		int evenFirstId = -1;
		int evenFirst = 0;
		int evenSecondId = -1;
		int evenSecond = 0;
		for(int i = 0; i < 100001; i++){
		    if(oddFirst < odd[i]){
		        oddSecondId = oddFirstId;
		        oddSecond = oddFirst;
		        oddFirstId = i;
		        oddFirst = odd[i];
		    }else if(oddSecond < odd[i]){
		        oddSecondId = i;
		        oddSecond = odd[i];
		    }
		    if(evenFirst < even[i]){
		        evenSecondId = evenFirstId;
		        evenSecond = evenFirst;
		        evenFirstId = i;
		        evenFirst = even[i];
		    }else if(evenSecond < even[i]){
		        evenSecondId = i;
		        evenSecond = even[i];
		    }
		}
		if(oddFirstId != evenFirstId){
		    result = n - (oddFirst + evenFirst);
		}else if(oddFirst + evenSecond < oddSecond + evenFirst){
		    result = n - (oddSecond + evenFirst);
		}else{
		    result = n - (oddFirst + evenSecond);
		}
		
		// 出力
		System.out.println(result);
		
	}
}