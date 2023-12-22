
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int[] a = new int[1000000];
		int end = 0;
		int findex=0;
		int m = 100000;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		a[0]=Integer.parseInt(str);
		
		
		for(int i=0; i<a.length-1 ;i++){
			if (a[i]==1){
				end += 1;
				if(end==2){
					findex=i;
					break;
				}
			}
			if (a[i]%2 == 0){
				a[i+1]=a[i]/2;
			}
			else {
				a[i+1]=a[i]*3+1;
			}
		}
		
		for(int i=0; i<m; i++){
			for(int j=i+1; j<m; j++){
				if (a[i]==a[j]){
					m = j;
				}
			}
		}
		System.out.println(m+1);
	}
}