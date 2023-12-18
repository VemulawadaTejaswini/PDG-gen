import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int kosu=0;

		int[] sosu=new int[55];
		sosu[0]=11;
		sosu[1]=31;
		sosu[2]=41;
		sosu[3]=61;
		sosu[4]=71;
		sosu[5]=101;
		sosu[6]=131;
		sosu[7]=151;
		sosu[8]=181;
		sosu[9]=191;
		sosu[10]=211;
		sosu[11]=241;
		sosu[12]=251;
		sosu[13]=271;
		sosu[14]=281;
		sosu[15]=311;
		sosu[16]=331;
		sosu[17]=401;
		sosu[18]=421;
		sosu[19]=431;
		sosu[20]=461;
		sosu[21]=491;
		sosu[22]=521;
		sosu[23]=541;
		sosu[24]=571;
		sosu[25]=601;
		sosu[26]=631;
		sosu[27]=641;
		sosu[28]=661;
		sosu[29]=691;
		sosu[30]=701;
		sosu[31]=751;
		sosu[32]=761;
		sosu[33]=811;
		sosu[34]=821;
		sosu[35]=881;
		sosu[36]=911;
		sosu[37]=941;
		sosu[38]=971;
		sosu[39]=991;
		sosu[40]=1021;
		sosu[41]=1031;
		sosu[42]=1051;
		sosu[43]=1061;
		sosu[44]=1091;
		sosu[45]=1151;
		sosu[46]=1171;
		sosu[47]=1181;
		sosu[48]=1201;
		sosu[49]=1231;
		sosu[50]=1291;
		sosu[51]=1301;
		sosu[52]=1321;
		sosu[53]=1361;
		sosu[54]=1381;

		try {
			str=bfr.readLine();

			if(str.equals("")) {

			}
			else {
				kosu=Integer.parseInt(str);
				String mojirt="";
				for(int i=0; i<kosu; i++) {
					mojirt=mojirt+sosu[i]+" ";
				}

				System.out.println(mojirt);
			}
		}catch(IOException e) {

		}

		catch(NumberFormatException ee) {
			System.exit(0);
		}

		catch(NullPointerException eee) {
			System.exit(0);
		}



	}
}