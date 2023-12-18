import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int card[][] = new int[4][14];
	    int i,j;
	    int count = 0;
	    int n = in.nextInt();
	    for ( j = 0; j < n; j++) {
	    	char m = in.next().charAt(0);
	    	int k = in.nextInt();
	        if(m == 'S')card[0][k] = 1;
	        if(m == 'H')card[1][k] = 1;
	        if(m == 'C')card[2][k] = 1;
	        if(m == 'D')card[3][k] = 1;
	        count = count + 1;
	    }
	    for(j = 0;j < 4; j++){
	        for(i = 1;i < 14;i++){
	            if(card[j][i] == 0){
	                if(j == 0)System.out.println("S " + i);
	                if(j == 1)System.out.println("H " + i);
	                if(j == 2)System.out.println("C " + i);
	                if(j == 3)System.out.println("D " + i);
	            }
	        }
	    }
	}
}