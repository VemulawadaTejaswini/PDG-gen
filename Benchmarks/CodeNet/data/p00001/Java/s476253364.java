import java.io.*;

class Main{
	private static void sort(int[] a){
		for(int i = 0;i<a.length-1;i++){
			for(int j = a.length-1;j > i;j--){
				if(a[j] > a[j-1]){
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
		}
	}
	private static void print_hill(int[] a){
		for(int i = 0;i<3;i++){
			System.out.println(a[i]);
		}
	}
		public static void main(String args[]) throws IOException{
			int hills[] = new int[10];
			InputStreamReader inp = new InputStreamReader(System.in);
			BufferedReader bre = new BufferedReader(inp);
			int n;
			for(int i = 0;i<10;i++){
				String num = bre.readLine();
				n = Integer.parseInt(num);
				hills[i] = n;
			}
			sort(hills);
			print_hill(hills);
	}
}