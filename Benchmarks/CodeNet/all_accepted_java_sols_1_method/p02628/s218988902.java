import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] data = new int[N];
		for (int i=0;i<N;i++) {
			data[i] = sc.nextInt();
		}
		int result = 0;
		for(int i=0;i<data.length-1;i++){
			for(int j=data.length-1;j>i;j--){
				if(data[j]<data[j-1]){
					int t=data[j];
					data[j]=data[j-1];
					data[j-1]=t;
				}
			}
		}		
		for (int i=0;i<K;i++) {
			result = result + data[i];
		}
		System.out.println(result);
		sc.close();
	}
}