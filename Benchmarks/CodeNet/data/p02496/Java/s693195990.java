import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int card[][] = {};
	    int i = 52,j;
	    int count = 0;
	    int n = in.nextInt();
	    while(count < n*2){
	    	char m = in.next().charAt(0);
	        if(m == 'S'){
	            card[0][i-1] = 1;
	        }
	        if(m == 'H'){
	            card[1][i-1] = 1;
	        }
	        if(m == 'C'){
	            card[2][i-1] = 1;
	        }
	        if(m == 'D'){
	            card[3][i-1] = 1;
	        }
	        count = count + 1;
	    }
	    for(j = 0;j < 4; j++){
	        for(i = 0;i < 13;i++){
	            if(card[j][i] == 0){
	                if(j == 0){
	                    System.out.println("S " + i+1);
	                }
	                if(j == 1){
	                	System.out.println("H " + i+1);
	                }
	                if(j == 2){
	                    System.out.println("C " + i+1);
	                }
	                if(j == 3){
	                    System.out.println("D " + i+1);
	                }
	            }
	        }
	    }
	}
}