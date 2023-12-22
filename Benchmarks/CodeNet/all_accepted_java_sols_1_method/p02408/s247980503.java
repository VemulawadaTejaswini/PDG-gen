import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<String> soot = new ArrayList<>();
		List<Integer> cardnum = new ArrayList<>();
		//int[][] cardpattern = new int[4][13];
		List<List<Integer>> cardpattern = new ArrayList<>();
		for(int i = 0; i < num; i++){
			soot.add(sc.next());
			cardnum.add(sc.nextInt());
		}
		for(int i = 0 ; i < 4 ; i++){
			List<Integer> cn = new ArrayList<>();
			for(int j = 1; j <= 13; j++){
				cn.add(j);
			}
			cardpattern.add(cn);
			cn = null;
			//System.out.println(cardpattern.get(i).size());
		}
		for(int i = 0; i < num; i++){

			switch(soot.get(i)){
			case "S":
				for(int j = 0; j < cardpattern.get(0).size(); j++){
					if(cardpattern.get(0).get(j) == cardnum.get(i)){
						cardpattern.get(0).remove(j);
					}
				}
				//cardpattern.get(0).remove(cardnum.get(i)-1);
				break;
			case "H":
				for(int j = 0; j < cardpattern.get(1).size(); j++){
					if(cardpattern.get(1).get(j) == cardnum.get(i)){
						cardpattern.get(1).remove(j);
					}
				}
				//cardpattern.get(1).remove(cardnum.get(i)-1);
				break;
			case "C":
				for(int j = 0; j < cardpattern.get(2).size(); j++){
					if(cardpattern.get(2).get(j) == cardnum.get(i)){
						cardpattern.get(2).remove(j);
					}
				}
				//cardpattern.get(2).remove(cardnum.get(i)-1);
				break;
			case "D":
				for(int j = 0; j < cardpattern.get(3).size(); j++){
					if(cardpattern.get(3).get(j) == cardnum.get(i)){
						cardpattern.get(3).remove(j);
					}
				}
				//cardpattern.get(3).remove(cardnum.get(i)-1);
				break;
			}
		}
		for(int i = 0;i < cardpattern.size(); i++){
			for(int j = 0; j < cardpattern.get(i).size(); j++){
				switch(i){
				case 0:
					System.out.println("S" + " " + cardpattern.get(i).get(j));
					break;
				case 1:
					System.out.println("H" + " " + cardpattern.get(i).get(j));
					break;
				case 2:
					System.out.println("C" + " " + cardpattern.get(i).get(j));
					break;
				case 3:
					System.out.println("D" + " " + cardpattern.get(i).get(j));
					break;
				}
			}
		}

	}

}
