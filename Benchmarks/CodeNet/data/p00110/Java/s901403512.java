import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	private static final String DIV_RGX = "(\\+|=)";

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));

    	String   s;
    	int      ans;
    	BigInteger[] num = new BigInteger[3];
    	while(sc.hasNext()){
    		s = sc.next();
    		ans = -1;
    		for(int i = head_check(s);i<10;i++){
    			num = chg(s,i);
    			if((num[0].add(num[1])).equals(num[2])){
    				ans = i;
    			}
    		}
    		if   (ans != -1){System.out.println(ans); }
    		else            {System.out.println("NA");}
    	}
	}

    private static int head_check(String s){
		String[] s_ar = s.split(DIV_RGX);
    	int ret = 0;
    	for(String s_:s_ar){
    		if(s_.charAt(0) == 'X' && s_.length() != 1){
    			ret = 1;
    		}
    	}
    	return ret;
    }

    private static BigInteger[] chg(String s,int r){
    	BigInteger[] ret = new BigInteger[3];
    	s = s.replace('X',String.valueOf(r).charAt(0));
		String[] s_ar = s.split(DIV_RGX);
		for(int i=0;i<3;i++){
			ret[i] = new BigInteger(s_ar[i]);
		}
		return ret;
    }
}