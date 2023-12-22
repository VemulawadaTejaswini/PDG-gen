import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n];
		for(int i=0; i<n; i++){
			ary[i] = sc.nextInt();
		}
		int ans = 0;
		int count = 1;
		for(int i=0; i<n; i++){
			if(ary[i] != count){
				ans++;
			} else {
				count++;
			}
		}
		Arrays.sort(ary);
		int tmp = Arrays.binarySearch(ary,1);
		if(tmp != -1){
			System.out.println(ans);
		} else {
			ans = -1;
			System.out.println(ans);
		}
	}
}
