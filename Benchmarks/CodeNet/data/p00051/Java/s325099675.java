import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int n = scan.nextInt();
			for(int i = 0 ; i < n;i++){
				char[] data = scan.next().toCharArray();
				int[] num = new int[data.length];
				for(int j = 0 ; j < data.length;j++){
					num[j] = Integer.parseInt(String.valueOf(data[j]));
				}
				Arrays.sort(num);
				int ans = 0;
				for(int j = 0 ;j < num.length;j++){
					ans += num[j] * Math.pow(10, j);
					ans -= num[j] * Math.pow(10, 7 -j);
				}
				System.out.println(ans);
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}