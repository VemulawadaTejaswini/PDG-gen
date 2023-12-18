import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
160
1 1 2 0
160
1 0 2 10
0


10 1
50 1
100 1

10 1
100 2


 */
public class Main {
	private static String result(int buy,int c10,int c50,int c100,int c500){
		int total=c10*10+c50*50+c100*100+c500*500;
		int rest=total-buy;
		int x500=rest/500;
		int x100=(rest-x500*500)/100;
		int x50=(rest-x500*500-x100*100)/50;
		int x10=(rest-x500*500-x100*100-x50*50)/10;
		
		StringBuilder sb=new StringBuilder();
		if(x10<c10){
			sb.append("10 ");
			sb.append(c10-x10);
			sb.append("\n");
		}
		if(x50<c50){
			sb.append("50 ");
			sb.append(c50-x50);
			sb.append("\n");
		}
		if(x100<c100){
			sb.append("100 ");
			sb.append(c100-x100);
			sb.append("\n");
		}
		if(x500<c500){
			sb.append("500 ");
			sb.append(c500-x500);
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while(true){
			String  line1 = reader.readLine();
			int buy = Integer.parseInt(line1);
			if(buy==0){
				break;
			}
			String[] line2s = reader.readLine().split(" ");
			int counts[]=new int[4];
			for(int i=0;i<4;i++){
				counts[i]=Integer.parseInt(line2s[i]);
			}
			System.out.print(result(buy,counts[0],counts[1],counts[2],counts[3]));
		}
		
	}
}