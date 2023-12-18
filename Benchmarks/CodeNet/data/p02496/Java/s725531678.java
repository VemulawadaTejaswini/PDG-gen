import java.util.HashMap;
import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Tramp t = new Tramp();
		t.input();
		t.findCard();
	}
}

class Tramp{
	HashMap<String,Integer> markToNum = new HashMap<String,Integer>();
	HashMap<Integer,String> numToMark = new HashMap<Integer,String>();
	int[][] card = new int[4][13];
	
	Tramp(){
		markToNum.put("S",0);
		markToNum.put("H",1);
		markToNum.put("C",2);
		markToNum.put("D",3);
		numToMark.put(0,"S");
		numToMark.put(1,"H");
		numToMark.put(2,"C");
		numToMark.put(3,"D");
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				card[i][j] = -1;
			}
		}
	}
	
	public void input(){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0;i<num;i++){
			int m = markToNum.get(scan.next());
			int n = scan.nextInt()-1;
			card[m][n] = 1;
		}
		scan.close();
	}
	
	public void findCard(){
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				if(card[i][j] == -1){
					System.out.println(numToMark.get(i)+" "+(j+1));
				}
			}
		}
	}
}