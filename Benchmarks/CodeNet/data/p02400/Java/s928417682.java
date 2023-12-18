import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int hankei = Integer.parseInt(str);
		double enshuritsu = Math.PI;
		double menseki = 0;
		double enshu = 0;
		
		menseki = hankei*hankei*enshuritsu;
		enshu = (hankei*2) * enshuritsu;
		
		String resultmenseki = String.format("%.6f", menseki);
		String resultenshu = String.format("%.6f", enshu);
		
		
		System.out.println(resultmenseki + " " +resultenshu);
	}

}