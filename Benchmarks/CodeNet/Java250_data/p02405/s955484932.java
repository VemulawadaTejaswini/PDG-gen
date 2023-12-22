import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	//private static final int BIG_NUM=2000000000;
	public static void main(String[]args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int H,W;
		String work[]=new String[2];
		
		while(true){
			try{
				work=br.readLine().split("[\\s]+");
				
				if(work[0].equals("0") && work[1].equals("0")){break;}	//両方とも0だったらループを抜ける.
				
				H=Integer.parseInt(work[0]);
				W=Integer.parseInt(work[1]);
				
				StringBuilder sb=new StringBuilder();
				for(int i=0; i<H; i++) {
					for(int j=0; j<W; j++) {
						if((i+j)%2==0){
							sb.append("#");
						}else {
							sb.append(".");
						}
					}
					sb.append(String.format("%n", ""));
				}
				System.out.println(sb);
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
