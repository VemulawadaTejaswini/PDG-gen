import java.io.*;
import java.util.*;

public class Main{
	public static int max = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] str = new String[n][2];
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i<n ; i++) {
			String line = br.readLine();
			list.add(line);
			str[i] = line.split(" ");
		}
		String[] mark = new String[n];
		int[] num = new int[n];

		for (int i = 0; i<n ; i++ ) {
			mark[i] = str[i][0];
			num[i] = Integer.parseInt(str[i][1]);	
		}

		quicksort(mark,num,0,n-1);


		int i = 1;
		while( i <= num[n-1] ){
			int search = 0;
			for (int j = 0; j<n ; j++ ) {
				if (num[j] == i) {
					int r = list.indexOf(mark[j] + " " + num[i]);
					if (search > r) {
						System.out.println("Not stable");
						i = num[n-1] + 1;
						break;
					}else{
						search = r;
					}
				}
			}
			i++;
			if ( i == num[n-1] + 1) {
				System.out.println("Stable");
			}
		}
		for (int k = 0; k<n ; k++ ) {
			System.out.println(mark[k] + " " + num[k]);
		}

	}

	public static void quicksort(String[] st,int[] a,int p,int r){
		if(p < r){
			int q = partition(st,a,p,r);
			quicksort(st,a,p,q-1);
			quicksort(st,a,q+1,r);
		}
	}

	public static int partition(String[] st,int[] a ,int p,int r){
		int x = a[r];
		int i = p-1;
		for (int j = p; j<r ; j++ ) {
			if (a[j] <= x)  {
				i++;
				int work = a[i];
				a[i] = a[j];
				a[j] = work;

				String workst = st[i];
				st[i] = st[j];
				st[j] = workst;
			}
		}
		int num = a[i+1];
		a[i+1] = a[r];
		a[r] = num;

		String str = st[i+1];
		st[i+1] = st[r];
		st[r] = str;
		return i+1;
	}

	public static void printing(int[] a){
		for (int i = 0; i<a.length ; i++ ) {
			if (i == a.length-1) {
				System.out.println(a[i]);
			}else{
				System.out.print(a[i] + " ");
			}
		}
	}
}