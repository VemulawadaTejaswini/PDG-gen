import java.util.*;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int k= sc.nextInt();
		int s= sc.nextInt();
		int suces=0;
		for(int x=0;x<=k;x++) {
			for(int y=0;y<=k;y++) {
				int z=s-x-y;
				if(0<=z && z<=k) {
					suces=suces+1;
				}
			}
		}
		System.out.println(suces);

	}

}
