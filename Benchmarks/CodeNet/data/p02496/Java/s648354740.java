import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	static int[][] cards = new int[4][13];
	public static void main(String[] args) {
		int S =0 , H=1 , C=2 , D = 3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
		int c = Integer.parseInt(br.readLine());
		for(;c>0;c--){
			String[] ab = br.readLine().split(" ");
			int a=0;
			if(ab[0]=="S") a=0;
			if(ab[0]=="H") a=1;
			if(ab[0]=="C") a=2;
			if(ab[0]=="D") a=3;
			int b = Integer.parseInt(ab[1]);
			cards[a][b]=1;
		}
		viewCard();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	static String ItoS(int i){
		if(i==0) return "S";
		if(i==1) return "H";
		if(i==2) return "C";
		if(i==3) return "D";
		else return"S";
	}
	static void viewCard () {
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				if(cards[i][j]==0){
					System.out.println(ItoS(i)+" "+(j+1));
				}
			}
		}
	}

}