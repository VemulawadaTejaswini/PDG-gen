import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
        int scanA =  scan.nextInt();
        int scanB =  scan.nextInt();
		int[] total = {scanA + scanB ,scanA - scanB ,scanA * scanB };
      	int max = total[0];
		for (int maxs : total){
        	max = Math.max(max , maxs );
        }
      	System.out.println(max);
    }
}
