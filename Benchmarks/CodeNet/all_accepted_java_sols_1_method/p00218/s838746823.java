import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n != 0){
			int pm[] = new int[n];
			int pe[] = new int[n];
			int pj[] = new int[n];
			for(int i = 0 ; i<n ; i++){
				pm[i] = scan.nextInt();
				pe[i] = scan.nextInt();
				pj[i] = scan.nextInt();
			}
			for(int i = 0; i < n ; i++){
				if(pm[i] == 100 || pe[i] == 100 || pj[i] == 100 || (pm[i]+pe[i])/2 >= 90 || (pm[i]+pe[i]+pj[i])/3>= 80){
					System.out.println("A");
				}else if(((pm[i]+pe[i]+pj[i])/3>=70) || ((pm[i]+pe[i]+pj[i])/3 >= 50 && ((pm[i] >= 80) || (pe[i]) >= 80))){
					System.out.println("B");
				}else{
					System.out.println("C");
				}
			}
			n = scan.nextInt();
		}
	}
}