import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	int r,c;
    	int total= 0;
    	Scanner sc = new Scanner(System.in);
    	r = sc.nextInt();
        c = sc.nextInt();
        int [][] a = new int [r+1][c+1];

    	for(int i = 0; i < r; i++){
			for(int j = 0; j < c+1; j++){
				if(j != c){
					a[i][j] = sc.nextInt();
					a[r][j] += a[i][j];
	    			System.out.print(a[i][j]+" ");
	    			total += a[i][j];
				}
				else{
					a[i][j] = total;
					System.out.println(a[i][j]);
					a[r][j] += a[i][j];
				}
			}
			total = 0;
    	}
    	sc.close();

    	for(int i = 0; i < c+1; i++){
    		if(i != c){
    			System.out.print(a[r][i]+" ");
    		}
    		else{
    			System.out.println(a[r][i]);
    		}
    	}
    }
}