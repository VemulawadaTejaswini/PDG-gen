import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			int k = 0;
			int start = 0;
			while(s.codePointAt(k)!=43) k++;
			String a = s.substring(start, k);
			k++;
			start = k;
			while(s.codePointAt(k)!=61) k++;
			String b = s.substring(start, k);
			String c = s.substring(k+1, s.length());
			
			start = 0;
			if(a.codePointAt(0)==88 && a.length()>1 || b.codePointAt(0)==88 && b.length()>1 || c.codePointAt(0)==88 && c.length()>1){
				start = 1;
			}
			
			String x, y, z;
			boolean flag = false;
			for(int i=start;i<10;i++){
				x = a;
				y = b;
				z = c;
				x = x.replaceAll("X", Integer.toString(i));
				y = y.replaceAll("X", Integer.toString(i));
				z = z.replaceAll("X", Integer.toString(i));
				BigInteger p = new BigInteger(x);
				BigInteger q = new BigInteger(y);
				BigInteger r = new BigInteger(z);
				
				if(p.add(q).compareTo(r)==0){
					System.out.println(i);
					flag = true;
					break;
				}
			}
			if(flag==false) System.out.println("NA");
		}
	}	
}