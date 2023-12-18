import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(is);

		String[][] eArray = new String[2][4000];
		int i;
		int j = 0;
		int k;
		boolean flg = false;

		for(i = 0; i < 4000; i++) eArray[1][i] = "0";

		int in = Integer.parseInt(br.readLine());

		while(in != 0){
			for(i = 0; i < in; i++){

				String str = br.readLine();

				int sp1 = str.indexOf(" ");
				int sp2 = str.lastIndexOf(" ");

				String e = str.substring(0, sp1);
				int p = Integer.parseInt(str.substring(sp1 + 1, sp2));
				int q = Integer.parseInt(str.substring(sp2 + 1, str.length()));

				for(k = 0; k < j; k++){
					if(eArray[0][k].equals(e)){
						eArray[1][k] = String.valueOf(Integer.parseInt(eArray[1][k]) + p * q);
					}
				}
				if(k == j){
					eArray[0][j] = e;
					eArray[1][j] = String.valueOf(p * q);
					j++;
				}
			}
			for(i = 0; i < j; i++){
				if(Integer.parseInt(eArray[1][i]) >= 1000000){
					System.out.println(eArray[0][i]);
					flg = true;
				}
				eArray[0][i] = "";
				eArray[1][i] = "0";
			}
			if(flg == false) System.out.println("NA");
			flg = false;
			in = Integer.parseInt(br.readLine());
		}
	}
}
