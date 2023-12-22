import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  i = 0;
		int  a[]= new int[101];

		while(sc.hasNext()){
			int  p = sc.nextInt();
			a[p]++;
		}
		sc.close();
		int max = 0;
		for(i = 0; i<100; i ++){
			if(max < a[i]){
				max = a[i];
			}
		}
		for(i = 0; i<100;i++){
			if(max == a[i]){
				System.out.println(i);
			}
		}
	}
}