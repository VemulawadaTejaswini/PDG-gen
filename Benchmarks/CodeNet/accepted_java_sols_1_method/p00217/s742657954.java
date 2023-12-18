import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	while(true){
		int n = sc.nextInt();
		if(n == 0) break;
		int no = 0;
		int dst = 0;
		for(int i = 0 ; i < n ; i++){
			int p = sc.nextInt();
			int d1 = sc.nextInt();
			int d2 = sc.nextInt();
				if(dst < d2 + d1){
					no = p;
					dst = d2 + d1;
				}
		}
		System.out.println(no + " " + dst);
	}
		sc.close();
	}

}