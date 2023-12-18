import java.util.Scanner;
class Main{
     public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int[][][] count = new int[4][3][10];
    	int n = scan.nextInt();
    	int[] b = new int[4];
    	int[] f = new int[4];
    	int[] r = new int[4];
    	int[] v = new int[4];


    	for(int i = 0; i < n; i++){
    		b[i] = scan.nextInt();
    		int temp = b[i] - 1;
    		
    		f[temp] = scan.nextInt();
    		r[temp] = scan.nextInt();
    		v[temp] = scan.nextInt();
    	}

    	for(int z = 0; z < 4; z++){
				for(int y = 0; y < 3; y++){
					for(int x = 0; x < 10; x++){
						if(y + 1 == f[z] && x + 1 == r[z]){
							System.out.print(" " + v[z]);
						}else{
							System.out.print(" 0");
						}
					}
					System.out.println("");
				}
		if(z != 3) System.out.println("####################");
    	}

    }
    	
}