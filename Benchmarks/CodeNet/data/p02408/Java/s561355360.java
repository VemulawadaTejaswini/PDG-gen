import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String[][] card = new String[4][13];
		String mark = "";
		int num =0;
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		for(int i=0;i<n;i++){
			mark= scan.next();
			num = Integer.parseInt(scan.next());
			if(mark.equals("S")) 	 card[0][num]="S";
			else if(mark.equals("H"))card[1][num]="H";
			else if(mark.equals("C"))card[2][num]="C";
			else 					 card[3][num]="D";
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				if(!card[i][j].equals("1"))
					System.out.println(card[i][j]+" "+j+1);
			}
		}
	}
}