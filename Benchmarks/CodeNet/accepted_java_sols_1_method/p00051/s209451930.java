import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine() ;
		for(int i = 0 ; i < Integer.parseInt(n); i++){
			String str = sc.nextLine();
			String[] stra = str.split("");
 			Arrays.sort(stra);
 			String buff = new String();
 			for(int j = 0 ; j < stra.length ; j++){
 				if(!("0".equals(stra[j]))){
 					buff += stra[j];
 				}
 			}
 			
 			if(buff.length() == 0) buff = "0";
 			
 			int min = Integer.parseInt(buff);
 			String[] strb = str.split("");
 			buff = new String();
 			Arrays.sort(strb,Collections.reverseOrder());
 			for(int k = 0 ; k < strb.length ; k++){
 				buff += strb[k];
 			}
 			int max = Integer.parseInt(buff);
 			System.out.println(max - min);
		}
		sc.close();
	}
}