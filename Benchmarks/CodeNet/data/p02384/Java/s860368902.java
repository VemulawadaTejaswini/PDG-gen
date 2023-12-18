import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Dice d = new Dice();
        Scanner sc = new Scanner(System.in);
        int i, top, frnt;
        
        for(i = 0; i < 6; i++) {
        	d.x[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        
        for(i = 0; i < n; i++) {
        	top = sc.nextInt();
        	frnt = sc.nextInt();
        	int rslt = solve(top, frnt, d.x);
        	System.out.println(rslt);
        }
    }
    
    public static int solve(int a, int b, int dice[]) {
    	int ans = -1;
    	if(a == dice[0] || a == dice[5])
    		if(b == dice[1]) 
    			ans = dice[2];
    		else if(b == dice[2]) 
    			ans = dice[4];
    		else if(b == dice[4]) 
    			ans = dice[3];
    		else
    			ans = dice[1];
    	else if(a == dice[1] || a == dice[4])
    		if(b == dice[2])
    			ans = dice[0];
    		else if(b == dice[0])
    			ans = dice[3];
    		else if(b == dice[3])
    			ans = dice[5];
    		else
    			ans = dice[2];
    	else if(a == dice[2] || a == dice[3])
    		if(b == dice[0])
    			ans = dice[1];
    		else if(b == dice[1])
    			ans = dice[5];
    		else if(b == dice[5])
    			ans = dice[4];
    		else
    			ans = dice[0];
    	
    	if(a == dice[5])
    		ans = dice[0] + dice[5] - ans;
    	else if(a == dice[4])
    		ans = dice[0] + dice[5] - ans;
    	else if(a == dice[3])
    		ans = dice[0] + dice[5] - ans;
    	
    	return ans;
    }
}


class Dice{
	public int x[] = new int[6];
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

