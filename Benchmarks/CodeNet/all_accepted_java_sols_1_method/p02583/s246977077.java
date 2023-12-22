import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		int num =0;
		for(int i =0;i<n;i++) {
			data[i]=sc.nextInt();
		}
		Arrays.sort(data);
		for(int i=0;i<n-2;i++) {
			for(int j = i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if((data[i]!=data[j])&&(data[k]!=data[j])&&(data[i]!=data[k])&&(data[i]+data[j]>data[k])&&(data[k]+data[j]>data[i])&&(data[i]+data[k]>data[j])) {
						num++;
					}
				}
			}
		}
		System.out.println(num);
		sc.close();
	}

}
