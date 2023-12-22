import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int mai  = n.nextInt();
		boolean card[][] = new boolean[4][14];
		for(int i = 0;i<4;i++){
			for(int t=0;t<13;t++){
				card[i][t]=false;
			}
		}
		for(int i=0;i<mai;i++){
			String p = n.next();
			int su = n.nextInt();
			if(p.equals("S")){
				card[0][su]=true;
			}else if(p.equals("H")){
				card[1][su]=true;
			}else if(p.equals("C")){
				card[2][su]=true;
			}else{
				card[3][su]=true;
			}
		}
		for(int i=0;i<4;i++){
			for(int t=1;t<=13;t++){
				if(card[i][t]==false){
					switch(i){
					case 0:
						System.out.print("S ");
						break;
					case 1:
						System.out.print("H ");
						break;
					case 2:
						System.out.print("C ");
						break;
					case 3:
						System.out.print("D ");
						break;
					}
					System.out.println(t);
				}
			}
		}
	}
}