import java.util.*;

public class Main{
//public class abc167_a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long[] arr = new long[n+1]; 
		for(int i=0; i<= n; i++){
			arr[i] = scan.nextLong();
		}
		long num = 0;
		long eda = 1;
		boolean flag = true;
		for(int i=0; i<= n; i++){
			if(i == 0 && arr[i] > 0){
				flag = false;
              	System.out.println("yes1"+i);
				break;
			}
			if( !(0 <= arr[i] || arr[i] < eda) ){
				if(arr[i] == eda && i== n){
					num += eda;
					break;
				}
				flag = false;
              System.out.println("yes2"+i);
				break;
			}

			num += eda;
			eda = (eda - arr[i])*2;

		}
		if(flag){
			System.out.println(num);
		}else{
			System.out.println(-1);
		}
	}

}