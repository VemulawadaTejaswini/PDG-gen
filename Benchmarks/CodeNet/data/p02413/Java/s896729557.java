import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int r, c, i, j, sum = 0, sumr = 0;
    	int ary[][], sumc[];
    	
    	r = sc.nextInt();
    	c = sc.nextInt();
    	
    	ary = new int[r][c];
    	sumc = new int[c];
    	
    	for(i = 0; i < r; i++) {
    		for(j = 0; j< c; j++) {
    			ary[i][j] = sc.nextInt();
    		}
    	}
    	
    	for(i = 0; i < r; i++) {
    		for(j = 0; j < c; j++) {
    			sum += ary[i][j];
    			sumr += ary[i][j];
    			sumc[j] += ary[i][j];
    			System.out.print(ary[i][j] + " ");
    			if(j == c-1) System.out.println(sumr);
    		}
    		sumr = 0;
    	}
    	for(i = 0; i < c; i++) {
    		System.out.print(sumc[i] + " ");
    	}
    	System.out.println(sum);
    }
}
