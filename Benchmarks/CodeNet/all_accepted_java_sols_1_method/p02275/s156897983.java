import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	static final int MAX_A_I = 10000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//System.setIn(new FileInputStream("./ALDS1_6_A-in8.txt"));
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] c = new int[MAX_A_I + 1];
		int[] a = new int[n+1];
		//String[] l = br.readLine().split(" ");
		for(int i = 0; i < n; ++i) {
			//a[i] = Integer.parseInt(l[i]);
			a[i] = Integer.parseInt(sc.next());
			c[a[i]] += 1;
			
		}
		sc.close();
		
		for(int i = 1; i <= MAX_A_I; ++i) {
			c[i] += c[i-1];
		}
		
		int[] b = new int[n+1];
		for(int i = n - 1; i >= 0; --i){
			//System.out.println(i + " " + a[i] + " " + c[a[i]]);
			b[c[a[i]] - 1] = a[i];
			c[a[i]] -=  1;
		}
		
		StringBuilder sb = new StringBuilder();//10*n);
		long start = System.nanoTime();
		for(int i= 0; i < n; ++i) {
			sb.append(b[i] + " ");
		}
		/*for(int i = 0; i <= MAX_A_I; ++i) {
			while(c[i] > 0){
				sb.append(i);
				sb.append(" ");
				c[i] -= 1;
			}
		}*/
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
		//System.out.println((System.nanoTime() - start)/1000/1000 + " ms");
	}

}