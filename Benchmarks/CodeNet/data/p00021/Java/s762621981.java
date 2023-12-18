import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null,tmp = "";
		int tmpa,i,s=0,t;
		double[] tm = new double[8];
		String[] rrr;
		double ew=0d,qw=0d;
		int io,po;
		BigDecimal[] one = null;
		
		try {
			tes = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		tmpa = Integer.parseInt(tes);
					
		for(i=0;i<tmpa;i++){
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			rrr = tes.split(" ");
			for(int j=0;j<rrr.length;j++){
				tm[j] = Double.parseDouble(rrr[j]);
				one[j] = new BigDecimal(rrr[j]);
			}
			BigDecimal divide1 = one[3].subtract(one[1]).divide(one[2].subtract(one[0]), 10, BigDecimal.ROUND_HALF_UP);
			BigDecimal divide2 = one[7].subtract(one[5]).divide(one[6].subtract(one[4]), 10, BigDecimal.ROUND_HALF_UP);
			ew = (tm[3]-tm[1])/(tm[2]-tm[0]);
			qw = (tm[7]-tm[5])/(tm[6]-tm[4]);
			io = (int) (ew*100000d);
			po = (int) (qw*100000d);
			if(divide1.compareTo(divide2) == 0)
			{
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}