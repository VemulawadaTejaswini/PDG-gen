import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int ipt=0;
		int pkz=0;
		boolean isp=true;
		try {
			str=bfr.readLine();
			int kazu=Integer.parseInt(str);

			if(str=="") {
				System.exit(0);
			}

			for(int i=0; i<kazu; i++) {
				isp=true;
				str=bfr.readLine();
				ipt=Integer.parseInt(str);

				for(int j=2; j<(int)Math.sqrt(ipt)+1; j++) {
					if(ipt%j!=0) {
						// nann mo sen
						if(j==(int)Math.sqrt(ipt) && isp==true) {
							isp=true;
						}
					}
					else {
						isp=false;
						break;
					}
				}
				if(isp==true) {
					pkz++;
				}
			}
			System.out.println(pkz);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		catch(NumberFormatException e) {
			System.exit(0);
		}

		catch(NullPointerException e) {
			System.exit(0);
		}

	}

}
