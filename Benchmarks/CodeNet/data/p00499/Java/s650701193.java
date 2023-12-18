package Class01;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i < 5; i++){
			a[i] = sc.nextInt();
		}
		double b = Math.ceil((double)a[1]/(double)a[3]);
		double b1 = Math.ceil((double)a[2]/(double)a[4]);
		int e;
		if(b>b1){
			e = (int)b;
		}else if(b == b1){
			e = (int)b;
		}else{
			e = (int)b1;
		}
		int ans = a[0] - e;
		
		System.out.println(ans);
	}

}