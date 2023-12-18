import java.util.*;
 
class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	DiceCtrl dc = new DiceCtrl();

    	for(int i = 0; i < 6; i++) {
    		dc.numList[i] = sc.nextInt();
    	}
    	
    	String ctrl = sc.next();
    	char[] ctrlList = ctrl.toCharArray();
    	
    	for(int i = 0; i < ctrlList.length; i++) {
    		switch(ctrlList[i]) {
    			case 'E' :
    				dc.ctrlE();
    				break;
    			case 'N' :
    				dc.ctrlN();
    				break;
    			case 'S' :
    				dc.ctrlS();
    				break;
    			case 'W' :
    				dc.ctrlW();
    				break;
    		}
    	}
    	System.out.println(dc.numList[0]);
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
}