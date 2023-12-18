import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] pasta = new int[3];
		int[] drink = new int[2];
		for(int i=0; i<3; i++){
			pasta[i] = s.nextInt();
		}
		for(int i=0; i<2; i++){
			drink[i] = s.nextInt();
		}
		int pmin = pasta[0];
		int dmin = drink[0];
		for(int i=1; i<3; i++){
			if(pasta[i]<pmin){
				pmin = pasta[i];
			}
		}
		for(int i=1; i<2; i++){
			if(drink[i]<dmin){
				dmin = drink[i];
			}
		}
		System.out.println(pmin+dmin-50);
	}
}