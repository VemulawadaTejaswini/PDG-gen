import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] count = new int [8];
		Arrays.fill(count, 0);
		int free = 0;
		int a ;
		for (int i = 0 ;i < n; ++i){
			a = Integer.parseInt(scan.next());
			if (a<=399)++count[0];
			else if (a<=799)++count[1];
			else if (a<=1199)++count[2];
			else if (a<=1599)++count[3];
			else if (a<=1999)++count[4];
			else if (a<=2399)++count[5];
			else if (a<=2799)++count[6];
			else if (a<=3199)++count[7];
			else free++;
		}

		int min=0;
		for(int i:count){
			if (i>0)++min;
		}
		if (min != 0){
			System.out.print(min+" "+(min+free));
		}else{
			System.out.print(1+" "+free);
		}





	}
}
//end
