import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) throws IOException{
	long start = System.currentTimeMillis();
	//Scanner scan = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//Scanner scan = new Scanner(System.in);
	//n = Integer.parseInt(scan.nextLine());
	int n = new Integer(br.readLine()).intValue();
	int[] a = new int[n];
	int[] b = new int[n];
	//int max = 0;
	String[] inputArray = br.readLine().split(" ");
	for (int i = 0; i < n; i++) {
	    //a[i] = scan.nextInt();
	    a[i] = new Integer(inputArray[i]).intValue();
	    //a[i] = Integer.parseInt(inputArray[i]);
	    //max = Math.max(max, a[i]);
	}
	//int[] b = new int[n];
	CountingSort(a, b, 10000);
	StringBuilder sb = new StringBuilder();
	//sb.append(b[0]);
	for (int i = 0; i < n; i++) {
	    sb.append(b[i]).append(' ');
	}
	//sb.append(b[n-1]);
	System.out.println(sb.toString().trim());
	long end = System.currentTimeMillis();
	//System.out.println((end-start) + "ms");
    }
    static void CountingSort (int[] a, int[] b, int k) {
	int n = a.length;
	int[] c = new int[k+1];
	for (int j = 0; j < n; j++) {
	    c[a[j]]++;
	}
	for (int i = 1; i <= k; i++) {
	    c[i] = c[i] +c[i-1];
	}
	for (int j = n - 1; j >= 0; j--) {
	    b[c[a[j]]-1] = a[j];
	    c[a[j]]--;
	}
    }
}