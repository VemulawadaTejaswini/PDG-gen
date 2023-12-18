import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null,tmp = "";
		int tmpa,i,s=0,t;
		double[] tm = new double[8];
		String[] rrr;
		
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
			}
			if((tm[3]-tm[1])/(tm[2]-tm[0]) == (tm[7]-tm[5])/(tm[6]-tm[4]))
			{
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			System.out.println((tm[3]-tm[1])/(tm[2]-tm[0]));
			System.out.println((tm[7]-tm[5])/(tm[6]-tm[4]));
		}
	}

}