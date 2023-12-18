import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			String[] str = new String[n];
			for(int i = 0;i < n;i++){
				str[i] = scan.next();
			}
			int[] a = new int[n*(n-1)];
			int count = 0;
			for(int i = 0;i < str.length;i++){
				for(int j = 0;j < str.length;j++){
					if(i == j){
						continue;
					}
					a[count] = Integer.parseInt(str[i]+str[j]);
					count++;
				}
			}
			Arrays.sort(a);
			System.out.println(a[2]);
		}
	}
}