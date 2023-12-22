import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan= null;
		int S =0;
		int H =1;
		int C =2;
		int D =3;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			while(scan.hasNext()){
				boolean[][] card = new boolean[4][13];
				int n = scan.nextInt();
				for(int i = 0; i < n;i++){
					String name = scan.next();
					if(name.equals("S"))card[S][scan.nextInt()-1]=true;
					if(name.equals("H"))card[H][scan.nextInt()-1]=true;
					if(name.equals("C"))card[C][scan.nextInt()-1]=true;
					if(name.equals("D"))card[D][scan.nextInt()-1]=true;
				}
				for(int i = 0;i <card.length;i++){
					for(int j = 0;j < card[i].length;j++){
						if(!card[i][j])
							if(i == S)
								System.out.println("S "+ (j+1));
							else if(i == H)
								System.out.println("H "+( j+1));
							else if(i == C)
								System.out.println("C "+ (j+1));
							else if(i == D)
								System.out.println("D " + (j+1));
					}
				}
			}
		}finally{
			scan.close();
		}
	}
}