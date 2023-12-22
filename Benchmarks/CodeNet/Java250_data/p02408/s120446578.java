import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static boolean[][] cards=new boolean[4][13];
	private static int n;
	public static void main (String[] args){
		n=sc.nextInt();
		setAllCardsExist();
		printMissingCards();
	}
	private static void setAllCardsExist(){
		for(int i=0;i<n;i++){
			setCardExist();
		}
	}
	private static void setCardExist(){
		char shape=sc.next().charAt(0);
		int num=sc.nextInt();
		switch(shape){
		case 'S':
			cards[0][num-1]=true;
			break;
		case 'H':
			cards[1][num-1]=true;
			break;
		case 'C':
			cards[2][num-1]=true;
			break;
		case 'D':
			cards[3][num-1]=true;
			break;
		}
	}
	private static void printMissingCards(){
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				printMissingCard(i,j);
			}
		}
	}
	private static void printMissingCard(int i,int j){
		if(cards[i][j]==false) System.out.println(getShape(i)+" "+(j+1));
	}
	private static char getShape(int i){
		switch(i){
		case 0:
			return 'S';
		case 1:
			return 'H';
		case 2:
			return 'C';
		case 3:
			return 'D';
		default:
			return ' ';
		}
	}
}