import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		String str = sc.nextLine();
		int[][] a = new int[10][10];
		int count = 9;
		for(int i = 0 ; i < 10 ; i++){
			a[0][i] = Integer.parseInt(str.substring(i,i+1)); 
		}
		for(int j = 1 ; j <= 9 ; j++){
			for(int k = 0 ; k < count ; k++){
				a[j][k] = (a[j-1][k] + a[j-1][k+1])% 10;
			}
			count--;
		}
		System.out.println(a[9][0]);
		}
		sc.close();
	}

}