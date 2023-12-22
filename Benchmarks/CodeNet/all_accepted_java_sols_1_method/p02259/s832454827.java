import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
  public static void main(String[] args) throws IOException {
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	int n = Integer.parseInt(br.readLine());
  	int[] a = new int[n];
  	String[] elements = br.readLine().split(" ");
  	
	for (int i = 0; i < n; ++i){
		a[i] = Integer.parseInt(elements[i]);
	}
	
	int num = 0;
	
	for (int i = 0; i < n-1; ++i){
		for (int j = n - 1; j > i; --j){
			if(a[j] < a[j-1]){
				int tmp = a[j-1];
				a[j-1] = a[j];
				a[j] = tmp;
				num = num + 1;
			}
		}
	}
	
	for(int i = 0; i < n; ++i){
		System.out.print(i == 0 ? a[i] : " " + a[i]);
	}
	System.out.println();
	System.out.println(num);
	
  }
}