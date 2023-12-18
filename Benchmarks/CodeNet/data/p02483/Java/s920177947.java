import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int[] a = new int[3];
		a[0] = Integer.parseInt(s[0]);
		a[1] = Integer.parseInt(s[1]);
		a[2] = Integer.parseInt(s[2]);
		int temp=0;
		if(a[0]>a[1]){
			temp = a[0];
			a[0] = a[1];
			a[1]=temp;
		}
		if(a[0]>a[2]){
			temp = a[0];
			a[0] = a[2];
			a[2]=temp;
		}
		if(a[1]>a[2]){
			temp = a[1];
			a[1] = a[2];
			a[2]=temp;
		}
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}	
}