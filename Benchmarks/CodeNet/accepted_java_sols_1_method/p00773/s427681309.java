import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String x1=sc.next();
			String y1=sc.next();
			int s=sc.nextInt();
			if((x1.equals("0")&&y1.equals("0"))&&s==0) break;
			BigDecimal n1=new BigDecimal("100");
			BigDecimal n2=new BigDecimal("1");
			BigDecimal x = new BigDecimal(x1);
			BigDecimal y = new BigDecimal(y1);
			BigDecimal tx = x.divide(n1,2,RoundingMode.DOWN);
			tx = tx.add(n2);
			BigDecimal ty = y.divide(n1,2,RoundingMode.DOWN);
			ty = ty.add(n2);
			int[] taxa = new int[s];
			int[] taxb = new int[s];
			for(int i=0;i<s;++i){
				BigDecimal n3=new BigDecimal(Integer.toString(i+1));
				BigDecimal tx2=tx.multiply(n3);
				BigDecimal ty2=ty.multiply(n3);
				taxa[i]=tx2.intValue();
				taxb[i]=ty2.intValue();
			}
			int max=0;
			for(int j=0;j<s-1;++j){
				for(int i=0;i<s-1;++i){
					int numa = taxa[j]+taxa[i];
					int numb = taxb[j]+taxb[i];
					if(numa==s && max<numb) max=numb; 
				}
			}
			System.out.println(max);
		}
	}
}

