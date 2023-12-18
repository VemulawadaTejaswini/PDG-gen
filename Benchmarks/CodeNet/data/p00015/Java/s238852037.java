import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main{

	public static void main(String args[]) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sc1;
		String sc2;
		BigDecimal a,b,c;
		String ks="";

		ks=br.readLine();
		for(int i=0; i<Integer.parseInt(ks); i++) {
			sc1=br.readLine();
			sc2=br.readLine();
			if(sc1.length()>=81 || sc2.length()>=81) {
				System.out.println("overflow");
			}

			else {
				a=new BigDecimal(sc1);
				b=new BigDecimal(sc2);
				c=a.add(b);

				if((c.precision()-c.scale())>=81) {
					System.out.println("overflow");
				}
				else {
					System.out.println(c);
				}
			}
		}
	}
}
