import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int  n = sc.nextInt();
			int cnt = 0;
			if(n == 0) break;
			while (n != 1){
				if(n%2 == 0){
					n = n/2;
					cnt++;
				}else{
					n = 3*n + 1;
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
		sc.close();
	}

}