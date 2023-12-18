import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int zero_inc[] = {0,1,2,3,4,5,6,7,8,9};
		int not_zero_inc[] = {1,2,3,4,5,6,7,8,9};
		
		while(sc.hasNextLine()){
			String ex[] = sc.nextLine().split("[+=]");
			
			boolean zero_ok = true;
			for(String tmp : ex){
				if(tmp.startsWith("X", 0) && tmp.length() >= 2){
					zero_ok = false;
					break;
				}
			}
			
			int ok_num = -1;
			for(int i : zero_ok ? zero_inc : not_zero_inc){
				BigInteger a = new BigInteger(ex[0].replaceAll("X", i+""));
				BigInteger b = new BigInteger(ex[1].replaceAll("X", i+""));
				BigInteger c = new BigInteger(ex[2].replaceAll("X", i+""));
				
				if(a.add(b).equals(c)){
					ok_num = i;
					break;
				}
			}
			
			System.out.println((ok_num != -1 ? ok_num+"" : "NA"));
		}
	}
}