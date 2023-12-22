import java.io.*;
public class Main{
	private static int bubble(int a[]){
		int count=0;
		for(int i = 0 ; i < a.length-1 ; i++){
			for(int j = a.length-1;j>i;j--){
				if(a[j]<a[j-1]){
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strdata = new String[n];
		String str = br.readLine();
		strdata = str.split(" ");
		int[] data = new int[n];
		for(int i = 0 ; i < n ; i ++)
			data[i] = Integer.parseInt(strdata[i]);
		int count = bubble(data);
		for(int i = 0 ; i < n-1; i++){
			System.out.print(data[i]+" ");
		}
		System.out.println(data[n-1]);
		System.out.println(count);
	}
}