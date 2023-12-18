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
				
				String mark="";	//最初のマーク
				for(int i=0; i<H; i++) {
					if(i%2==0) {
						mark="#";
					}else {
						mark=".";
					}
					for(int j=0; j<H; j++) {
						System.out.print(mark);
						if(mark.equals("#")){
							mark=".";
						}else {
							mark="#";
						}
					}
					System.out.printf("%n");
				}
				System.out.printf("%n");
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
