import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger million = new BigInteger("1000000");

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			String[] no = new String[n];
			BigInteger[] sum = new BigInteger[n];
			int size = 0;

			for(int i=0;i<n;i++){
				String s = sc.next();
				BigInteger mul = sc.nextBigInteger().multiply(sc.nextBigInteger());
				int j;

				for(j=0;j<size;j++){
					if(no[j].equals(s)){
						sum[j] = sum[j].add(mul);
						break;
					}
				}

				if(j == size){
					no[size] = s;
					sum[size] = mul;
					size++;
				}
			}

			boolean naflg = true;
			for(int i=0;i<size;i++){
				if(sum[i].compareTo(million) >= 0){
					System.out.println(no[i]);
					naflg = false;
				}
			}

			if(naflg) System.out.println("NA");
		}
	}
}