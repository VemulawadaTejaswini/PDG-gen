import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		DecimalFormat df = new DecimalFormat("0");
		double debt = 100000;
		for(int i=0;i<n;i++){
			debt = debt + (debt * 0.05);
			if(debt % 1000 != 0){
				debt = (debt / 1000 + 1) * 1000;
				debt = debt - debt % 1000;
			}
		}
		System.out.println(df.format(debt));
	}

}