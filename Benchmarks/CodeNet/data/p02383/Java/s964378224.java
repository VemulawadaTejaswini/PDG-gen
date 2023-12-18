import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Dice d = new Dice();
        Scanner sc = new Scanner(System.in);
        int i;
        for(i = 0; i < 6; i++) {
        	d.x[i] = sc.nextInt();
        }
        for(char c: sc.next().toCharArray()) {
        	d.roll(c);
        }
        
        System.out.println(d.x[0]);
        
    }
}


class Dice{
	public int x[] = {1, 2, 3, 4, 5, 6};
	int tmp1, tmp2;
	
	public void roll(char direction) {
		switch(direction) {
		case 'E':
			tmp1 = x[0];
    		x[0] = x[3];
    		tmp2 = x[2];
    		x[2] = tmp1;
    		tmp1 = x[5];
    		x[5] = tmp2;
    		x[3] = tmp1;
    		return;
    		
		case 'S':
			tmp1 = x[0];
    		x[0] = x[4];
    		tmp2 = x[1];
    		x[1] = tmp1;
    		tmp1 = x[5];
    		x[5] = tmp2;
    		x[4] = tmp1;
    		return;
		
		case 'W':
			tmp1 = x[0];
    		x[0] = x[2];
    		tmp2 = x[3];
    		x[3] = tmp1;
    		tmp1 = x[5];
    		x[5] = tmp2;
    		x[2] = tmp1;
    		return;
    		
		case 'N':
			tmp1 = x[0];
    		x[0] = x[1];
    		tmp2 = x[4];
    		x[4] = tmp1;
    		tmp1 = x[5];
    		x[5] = tmp2;
    		x[1] = tmp1;
    		return;
		}
	}
}


