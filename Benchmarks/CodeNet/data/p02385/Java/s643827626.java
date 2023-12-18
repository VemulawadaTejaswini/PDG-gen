import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


 class Dice {
	private int top;
	private int front;
	private int right;
	private int left;
	private int back;
	private int bottom;

	public Dice() {
		// TODO ?????????????????????????????????????????????????????????
	}

	public Dice(int top, int front, int right, int left, int back, int bottom) {
		this.top = top;
		this.front = front;
		this.right = right;
		this.left = left;
		this.back = back;
		this.bottom = bottom;
	}

	public void setDice(int top, int front, int right, int left, int back, int bottom) {
		this.top = top;
		this.front = front;
		this.right = right;
		this.left = left;
		this.back = back;
		this.bottom = bottom;
	}

	public void rollDice(String str){
		if(str.equals("N"))rollNorth();
		if(str.equals("S"))rollSouth();
		if(str.equals("E"))rollEast();
		if(str.equals("W"))rollWest();
	}

	public void rollNorth(){
		setDice(front,bottom,right,left,top,back);
	}

	public void rollSouth(){
		setDice(back,top,right,left,bottom,front);
	}

	public void rollEast(){
		setDice(left,front,top,bottom,back,right);
	}

	public void rollWest(){
		setDice(right,front,bottom,top,back,left);
	}

	public Map<String,Integer> getDice(){
		Map<String,Integer> dice = new HashMap<String,Integer>();
		dice.put("top", top);
		dice.put("front", front);
		dice.put("right", right);
		dice.put("left", left);
		dice.put("back", back);
		dice.put("bottom", bottom);
		return dice;
	}


	public int getTop() {
		return top;
	}


	public void setTop(int top) {
		this.top = top;
	}
	public int getBottom() {
		return bottom;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	public int getFront() {
		return front;
	}
	public void setFront(int front) {
		this.front = front;
	}
	public int getBack() {
		return back;
	}
	public void setBack(int back) {
		this.back = back;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}


}

public class Main {
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	Dice dice1 = new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
	Dice dice2 = new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());

		if(compareDice(dice1,dice2)) System.out.println("Yes");
		else System.out.println("No");

	}

	static boolean compareDice(Dice dice1,Dice dice2){
		Map<String,Integer> dicenum1 =dice1.getDice();
		Map<String,Integer> dicenum2 =dice2.getDice();
		boolean same = false;
		for(int i=0; i<4 ; i++){
			dice2.rollSouth();
			dicenum2 = dice2.getDice();
			same = compareDiceNumber(dicenum1,dicenum2);
			if(same) return same;
		}

		for(int i =0;i<3 ;i++){
			dice2.rollEast();
			dicenum2 = dice2.getDice();
			same = compareDiceNumber(dicenum1,dicenum2);
			if(same) return same;
		}
		return same;
	}

	static boolean compareDiceNumber(Map<String,Integer> dicenum1,
		Map<String,Integer> dicenum2){
			Set<String> loc =dicenum1.keySet();
			boolean same = false;
			for(String locdata : loc){
				if(dicenum1.get(locdata)==dicenum2.get(locdata)) same = true;
			}
		return same;

	}



}