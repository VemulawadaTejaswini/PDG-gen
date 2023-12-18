import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		while(scan.hasNext()){
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
			x3 = scan.nextDouble();
			y3 = scan.nextDouble();
			xp = scan.nextDouble();
			yp = scan.nextDouble();
			double S_pab = Math.abs((x1 - xp) * (y2 - yp) - (x2 - xp) * (y1 - yp));
			double S_pac = Math.abs((x1 - xp) * (y3 - yp) - (x3 - xp) * (y1 - yp));
			double S_pbc = Math.abs((x2 - xp) * (y3 - yp) - (x3 - xp) * (y2 - yp));
			double S_abc = Math.abs((x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1));
			if(S_abc == S_pab + S_pac + S_pbc){
				list.add("YES");
			} else{
				list.add("NO");
			}
		}

		for(String s : list){
			System.out.printf("%s\n", s);
		}
	}
}