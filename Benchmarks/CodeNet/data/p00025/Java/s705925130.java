import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		
		String[] s;
		int hit,blow;
		int[][] ar = new int[2][4];
		while(sc.hasNext()){
			hit = blow = 0;
			for(int i=0;i<2;i++){
				s = sc.next().split("\\s");
				for(int j=0;j<4;j++){ar[i][j] = Integer.parseInt(s[j]);}
			}

			//calculation
			for(int i=0;i<4;i++){if(ar[0][i] == ar[1][i]){hit++;}}
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(ar[0][i] == ar[1][j] && i != j){
						blow++;
					}
				}
			}

		//output
		System.out.println(hit + " " + blow);
		}
	}
}