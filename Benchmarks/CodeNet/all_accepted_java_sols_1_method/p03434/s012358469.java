import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(); //枚数
	int alice = 0; //アリスの合計点
	int bob = 0; //ボブの合計点
	ArrayList<Integer> cardList = new ArrayList<>();
	for(int i=0; i<num; i++){
		cardList.add(sc.nextInt());
	}
	//降順でソート
	Collections.sort(cardList, Collections.reverseOrder());
	
	int turn=1;
	for(int card:cardList){
		if(turn%2 == 1){
			alice = alice+card;
		}else{
			bob = bob+card;
		}
		turn++;
	}
	System.out.println(alice - bob);
  }
}