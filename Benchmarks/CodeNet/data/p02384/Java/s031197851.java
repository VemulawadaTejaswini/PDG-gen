import java.util.*;
 
class Main {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	DiceCtrl dc = new DiceCtrl();

    	for(int i = 0; i < 6; i++) {
    		dc.numList[i] = sc.nextInt();
    	}
    	
    	int q = sc.nextInt();
    	int top, front;
    	int[] rightList = new int[q];
    	for(int i = 0; i < q; i++) {
    		top = sc.nextInt();
    		front = sc.nextInt();
    		rightList[i] = dc.getRight(top, front);
    	}
    	
    	for(int i = 0; i < q; i++) {
    		System.out.println(rightList[i]);
    	}
    }
}
class DiceCtrl {
	public int[] numList = new int[6];
	private int tmp = 0;
	
	void ctrlE() {
		tmp = numList[0];
		numList[0] = numList[3];
		numList[3] = numList[5];
		numList[5] = numList[2];
		numList[2] = tmp;
	}
	void ctrlN() {
		tmp = numList[0];
		numList[0] = numList[1];
		numList[1] = numList[5];
		numList[5] = numList[4];
		numList[4] = tmp;
	}
	void ctrlS() {
		tmp = numList[0];
		numList[0] = numList[4];
		numList[4] = numList[5];
		numList[5] = numList[1];
		numList[1] = tmp;
	}
	void ctrlW() {
		tmp = numList[0];
		numList[0] = numList[2];
		numList[2] = numList[5];
		numList[5] = numList[3];
		numList[3] = tmp;
	}
	void ctrlR() {
		tmp = numList[1];
		numList[1] = numList[2];
		numList[2] = numList[4];
		numList[4] = numList[3];
		numList[3] = tmp;
	}
	int getRight(int t, int f) {
		for(int i = 0; i < 3; i++) {
			if(t == numList[0]) {
				break;
			}
			ctrlN();
			if(t == numList[0]) {
				break;
			}
			ctrlW();
		}
		for(int i = 0; i < 3; i++) {
			if(f == numList[1]) {
				break;
			}
			ctrlR();
		}
		return numList[2];
	}
}