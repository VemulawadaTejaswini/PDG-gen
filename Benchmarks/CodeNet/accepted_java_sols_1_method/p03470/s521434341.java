import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] d = new int[N];
		for(int i = 0; i < N; i++) d[i] = sc.nextInt();
		Arrays.sort(d);
		
		int ans = 1;
		int bef = d[0];
		for(int i = 0; i < N; i++){
			if(d[i] != bef){
				bef = d[i];
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}