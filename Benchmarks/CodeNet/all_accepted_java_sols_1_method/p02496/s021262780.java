import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	String[] marks = { "S", "H", "C", "D"};
	int card[][];
	card = new int[4][13];
	int n = s.nextInt();
	int i, j;
	int number;
	String mark;
	for(i=0; i<n; i++){
		mark = s.next();
		number = s.nextInt();
		for(j=0; j<4; j++){
			if(mark.equals(marks[j])){
				card[j][number-1] = 1;
			}
		}
	}
	for(j=0; j<4; j++){
		for(i=0; i<13; i++){
			if(card[j][i]==0){
				System.out.println(marks[j]+" "+(i+1));
			}
		}
	}
	}
}