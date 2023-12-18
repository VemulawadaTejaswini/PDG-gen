import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int ai,bi,ci,aj,bj,cj;
		ai = a;
		bi = b;
		ci = c;
		int count =0;
		while(ai%2==0&&bi%2==0&&ci%2==0){
			aj = (bi+ci)/2;
			bj = (ci+ai)/2;
			cj = (ai+bi)/2;
			ai = aj;
			bi = bj;
			ci = cj;
			if(ai==a&&bi==b&&ci==c) {
				count = -1;
				break;
			}
			count ++;
		}
		System.out.println(count);

	}

}