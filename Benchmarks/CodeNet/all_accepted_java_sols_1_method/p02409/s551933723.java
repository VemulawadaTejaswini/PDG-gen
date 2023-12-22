
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ??\?±???¶???
		int[][][] tenantInfo = new int[4][3][10];

		try {
			// ??\?????¶??°?????\???
			int num = Integer.parseInt(br.readLine());

			// ??\???????????\???
			String str;
			String[] strArr;
			int b,f,r,v;
			for(int i=0;i<num;i++){
				str = br.readLine();
				strArr = str.split(" ");
				b = Integer.parseInt(strArr[0])-1;
				f = Integer.parseInt(strArr[1])-1;
				r = Integer.parseInt(strArr[2])-1;
				v = Integer.parseInt(strArr[3]);

				// ??\?±??????°????¨????
				tenantInfo[b][f][r]+=v;
			}

			// ??????
			StringBuilder output = new StringBuilder();
			for(int i = 0; i<tenantInfo.length; i++){

				for(int j = 0; j<tenantInfo[i].length; j++){

					for(int k = 0; k<tenantInfo[i][j].length; k++){
						output.append(" ");
						output.append(String.valueOf((tenantInfo[i][j][k])));
					}

					// ???????±?????????????
					System.out.println(output.toString());

					// ?????????
					output.setLength(0);
				}
				// ?£???????????????????
				if(i!=(tenantInfo.length-1)){
					System.out.println("####################");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(br != null){
					br.close();
				}
			}catch(IOException ioe){
			}

		}
	}
}