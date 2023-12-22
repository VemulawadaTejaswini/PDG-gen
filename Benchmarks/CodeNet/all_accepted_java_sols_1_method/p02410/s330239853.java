import java.util.Scanner;
 
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        	int x = sc.nextInt();
		int y = sc.nextInt();
	        int[][]a = new int[x][y];
	        int[]b = new int[y];
	        int[]c = new int [x];

		for(int i =0 ; i < x; i++){
            		for(int j = 0; j < y; j++){
                		a[i][j] = sc.nextInt();
            		}
        	}
         
        	for(int i = 0; i < y; i++){
            		b[i] = sc.nextInt();
        	}
        	for(int i = 0; i < x; i++){
            		for(int j = 0; j < y; j++){
                		c[i] += a[i][j] * b[j];
            		}
            		System.out.println(c[i]);
        	}
    	}
}