import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[200];
		int i=0;
		while(sc.hasNext()){
			sum[i] = sc.nextInt() + sc.nextInt();
			i++;
		}
		
		for(int j=0;j<i;j++){
			int k=0;
			while(sum[j]!=0){
				k++;
				sum[j] /= 10;
			}
			System.out.println(k);
		}
	}
}