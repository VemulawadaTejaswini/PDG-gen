import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			char sur[][] = new char[8][8];
			int p=0, c=0;
			boolean judge = false;
			char t = ' ';

			for(int i=0; i<8; i++){
				sur[i] = scan.next().toCharArray();
			}

			for(int i=0; i<8; i++){
				for(int j=0; j<8; j++){
					if(sur[i][j] == '1'){
						judge=true;
						c += p;
					}
					if(judge)
						p++;
				}
			}

			if(c==18){t = 'A';}
			else if(c==48){t = 'B';}
			else if(c==6){t = 'C';}
			else if(c==30){t = 'D';}
			else if(c==20){t = 'E';}
			else if(c==34){t = 'F';}
			else if(c==16){t = 'G';}

			System.out.println(t);
		}
	}
}