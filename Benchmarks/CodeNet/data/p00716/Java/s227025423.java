import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	
	for(int k = 0; k < m; k++){
	    String str = sc.next();
	    BigDecimal def = new BigDecimal(str);
	    int y = sc.nextInt();
	    int n = sc.nextInt();
	    BigDecimal bdm = new BigDecimal(0);

	    for(int i = 0; i < n; i++){
		int s = sc.nextInt();
		str = sc.next();
		BigDecimal bd2 = new BigDecimal(str);
		str = sc.next();
		BigDecimal bd3 = new BigDecimal(str);
		BigDecimal bd = def;
		BigDecimal bd4 = new BigDecimal(0);
		if(s == 1){
		    for(int j = 0; j < y; j++){
			bd4 = bd.multiply(bd2);
			bd4 = bd4.setScale(0, BigDecimal.ROUND_DOWN);
			bd = bd4.add(bd);
			bd = bd.subtract(bd3);
		    }
		} else {
		    for(int j = 0; j < y; j++){
		        bd4 = bd4.add(bd2.multiply(bd));
			bd4 = bd4.setScale(0, BigDecimal.ROUND_DOWN);
			bd = bd.subtract(bd3);
		    }
		    bd = bd.add(bd4);
		}
		if(bdm.compareTo(bd) == -1){
		    bdm = bd;
		}
	    }
	    System.out.println(bdm.toString());
	}
    }

    public static void main(String[] args){
	new Main();
    }
}