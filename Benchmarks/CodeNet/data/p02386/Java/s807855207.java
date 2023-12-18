import java.util.Arrays;
import java.util.Scanner;
 
class Main {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int num = Integer.parseInt(sc.nextLine());
 
        	Dice[] dices = new Dice[num];
        	boolean flag = true;
 
        	loop: for (int i = 0; i < num; i++) {
            		dices[i] = new Dice(sc.nextLine());
            		for (int j = 0; j < i; j++) {
                		if (dices[i].equals(dices[j])) {
                    			flag = false;
                    			break loop;
                		}
            		}
        	}
        	System.out.println(flag ? "Yes" : "No");
    	}
}
 
class Dice {
    	int[] x = new int[6];
 
   	Dice(String s) {
        	String[] y = s.split(" ");
        	for (int i = 0; i < 6; i++) {
            		x[i] = Integer.parseInt(y[i]);
        	}
    	}

    	public void roll(char c) {
        	int temp;
        	switch (c) {
		        case 'E':
		            temp = x[0];
		            x[0] = x[3];
		            x[3] = x[5];
		            x[5] = x[2];
		            x[2] = temp;
		            break;
		        case 'N':
		            temp = x[0];
		            x[0] = x[1];
		            x[1] = x[5];
		            x[5] = x[4];
		            x[4] = temp;
		            break;
		        case 'W':
		            temp = x[0];
		            x[0] = x[2];
		            x[2] = x[5];
		            x[5] = x[3];
		            x[3] = temp;
		            break;
		        default:
		            temp = x[0];
		            x[0] = x[4];
		            x[4] = x[5];
		            x[5] = x[1];
		            x[1] = temp;
		            break;
        	}
    	}
 
    	public boolean equals(Dice d) {
        	char[] c = { 'E', 'E', 'E', 'N', 'W', 'W', 'W', 'S' };
        	boolean flag = false;
        	loop: for (int i = 0; i < 24; i++) {
            		if (Arrays.equals(x, d.x)) {
                		flag = true;
                		break loop;
            		}
            		d.roll(c[i % 8]);
        	}
        	return flag;
    	}
}