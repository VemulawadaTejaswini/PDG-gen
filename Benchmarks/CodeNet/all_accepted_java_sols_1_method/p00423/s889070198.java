import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int a[] = new int[n];
			int b[] = new int[n];
			int suma=0, sumb=0;
			for(int i = 0; i < n;i++){
				a[i]=cin.nextInt();
				b[i]=cin.nextInt();
				if(a[i] > b[i]){
					suma += a[i]+b[i];
				}
				else if(a[i] < b[i]){
					sumb += a[i]+b[i];
				}
				else{
					suma += a[i];
					sumb += b[i];
				}
			}
			System.out.println(suma + " " + sumb);
		}
			
	}

}