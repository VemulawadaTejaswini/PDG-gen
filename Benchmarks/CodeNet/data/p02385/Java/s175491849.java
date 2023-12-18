
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> listDice1 = new ArrayList<Integer>();

		boolean isOk1 = false;
		boolean isOk2 = false;
		boolean isOk3 = false;
		boolean isOk4 = false;


		//??????????????????????????????
		int top = sc.nextInt();
		int back = sc.nextInt();
		int right = sc.nextInt();
		int left = sc.nextInt();
		int front = sc.nextInt();
		int under = sc.nextInt();

		listDice1.add(top);
		listDice1.add(back);
		listDice1.add(right);
		listDice1.add(left);
		listDice1.add(front);
		listDice1.add(under);

		int top1 = sc.nextInt();
		int back1 = sc.nextInt();
		int right1 = sc.nextInt();
		int left1 = sc.nextInt();
		int front1 = sc.nextInt();
		int under1 = sc.nextInt();

		int[] Dice = {top1, back1, right1, left1, front1, under1};

		for(int i = 0; i < 6; i++ ) {
			if(listDice1.contains((Integer)Dice[i])) {
				listDice1.remove((Integer)Dice[i]);
			}
		}
	//	System.out.println("listDice1.isEmpty()"+listDice1.isEmpty());

		Dice insDice1 = new Dice(top, under, left, right, front, back);
		Dice insDice2 = new Dice(top1, under1, left1, right1, front1, back1);

		while(!isOk1) {
			if(!isOk2) {
				insDice2 = insDice2.northMove(insDice2);
				isOk2 = true;
			}
			else if(isOk2) {
				insDice2 = insDice2.eastMove(insDice2);
				isOk2 = false;
			}
			if(insDice1.getTopDice() == insDice2.getTopDice()) {
				isOk1 = true;
			}
		}
		while(!isOk3) {
			insDice2 = insDice2.anticlockwise(insDice2);
			if(insDice1.back == insDice2.getBackDice()) {
				isOk3 = true;
			}
		}
		if(isOk1 && isOk3) {
			if(insDice1.right == insDice2.right) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	//	System.out.println("insDice1.getTopDice() : "+insDice1.getTopDice());
	//	System.out.println("insDice2.getTopDice() : "+insDice2.getTopDice());

	//	System.out.println("insDice1.back : "+insDice1.back);
	//	System.out.println("insDice2.back : "+insDice2.back);


	}
}
class Dice{
	//?????£?????????
	int top;
	int under;
	int left;
	int right;
	int front;
	int back;

	//?????°???????????????????????????
	public Dice(int top, int under, int left, int right, int front, int back){
		this.top = top;
		this.under = under;
		this.left = left;
		this.right = right;
		this.front = front;
		this.back = back;
	}
	//??????????????????????????????????????????
	public void findDice() {
		System.out.println("top : "+top);
		System.out.println("under : "+under);
		System.out.println("left : "+left);
		System.out.println("right : "+right);
		System.out.println("front : "+front);
		System.out.println("back : "+back);
	}
	//????????????????????¢??????????????????
	public Dice northMove(Dice insDice) {

		int top1 = insDice.top;
		int under1 = insDice.under;
		int  left1 = insDice.left;
		int right1 = insDice.right;
		int front1 = insDice.front;
		int back1 = insDice.back;

		insDice.top = back1;
		insDice.under = front1;
		insDice.left = left1;
		insDice.right = right1;
		insDice.front = top1;
		insDice.back = under1;

		return insDice;
	}
	//????????????????????¢??????????????????
	public Dice southMove(Dice insDice) {

		int top1 = insDice.top;
		int under1 = insDice.under;
		int  left1 = insDice.left;
		int right1 = insDice.right;
		int front1 = insDice.front;
		int back1 = insDice.back;

		insDice.top = front1;
		insDice.under = back1;
		insDice.left = left1;
		insDice.right = right1;
		insDice.front = under1;
		insDice.back = top1;

		return insDice;
	}
	//????????????????????¢??????????????????
	public Dice westMove(Dice insDice) {

		int top1 = insDice.top;
		int under1 = insDice.under;
		int  left1 = insDice.left;
		int right1 = insDice.right;
		int front1 = insDice.front;
		int back1 = insDice.back;

		insDice.top = right1;
		insDice.under = left1;
		insDice.left = top1;
		insDice.right = under1;
		insDice.front = front1;
		insDice.back = back1;

		return insDice;
	}
	//????????????????????¢??????????????????
	public Dice eastMove(Dice insDice) {

		int top1 = insDice.top;
		int under1 = insDice.under;
		int  left1 = insDice.left;
		int right1 = insDice.right;
		int front1 = insDice.front;
		int back1 = insDice.back;

		insDice.top = left1;
		insDice.under = right1;
		insDice.left = under1;
		insDice.right = top1;
		insDice.front = front1;
		insDice.back = back1;

		return insDice;
	}
	public Dice anticlockwise(Dice insDice) {

		int top1 = insDice.top;
		int under1 = insDice.under;
		int  left1 = insDice.left;
		int right1 = insDice.right;
		int front1 = insDice.front;
		int back1 = insDice.back;

		insDice.top = top;
		insDice.under = under;
		insDice.left = front1;
		insDice.right = back1;
		insDice.front = right1;
		insDice.back = left1;


		return insDice;
	}

	public int getTopDice() {
		return top;
	}
	public int getBackDice() {
		return back;
	}
	public int getRightDice() {
		return right;
	}
}