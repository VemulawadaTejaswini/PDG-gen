import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		BigDecimal result =new BigDecimal(1);
		String S = sc.next();
		int Rcount=0,Gcount=0,Bcount=0;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='R') {
				Rcount++;
			} else if (S.charAt(i)=='G'){
				Gcount++;
			} else {
				Bcount++;
			}
		}
		result = result.multiply(new BigDecimal(Rcount));
		result = result.multiply(new BigDecimal(Gcount));
		result = result.multiply(new BigDecimal(Bcount));
		int count =0;
		for (int i=0;i<N;i++) {
			for (int j=1;j<=N/2;j++) {
				if (i+j*2>=N) {
					continue;
				}
				if (S.charAt(i)!=S.charAt(i+j)&&S.charAt(i+j)!=S.charAt(i+j+j)&&S.charAt(i+j+j)!=S.charAt(i)) {
					count --;
				}
			}
		}
		result = result.add(new BigDecimal(count));
		System.out.println(result.toString());
	}
}