
import java.util.*;
class Main {
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
		double heikin = 0;
		double powM = 0;
		int howM = 0;
			if((howM = scan.nextInt()) == 0 ) {
				break;
			}
			int mem = 0;
			for(int i = 0; i < howM ; i++) {
				mem = scan.nextInt();
				heikin += mem;
				powM  +=Math.pow(mem , 2);
			}
			heikin /= howM;
		    powM  /=howM;
           Double powH = Math.pow(heikin,2);
			//System.out.println(heikin  + " " + powM);
			System.out.println(Math.sqrt(powM - powH));
		}
	}
}
