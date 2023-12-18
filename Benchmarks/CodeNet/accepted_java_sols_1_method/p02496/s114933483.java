import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		Boolean box[][] = new Boolean [4][13];
		for(int k = 0; k < 4; k++){
			for(int j = 0; j < 13; j++){
				box[k][j] = false;
			}	
		}
		
		for(int i = 0; i < m; i++){
			char mark;
			int a,s;
			mark = sc.next().charAt(0);
			a = sc.nextInt();
			s = 0;
			
			if (mark == 'S')s = 0;
			else if(mark == 'H')s = 1;
			else if(mark == 'C')s = 2;
			else if(mark == 'D')s = 3;
			box[s][a-1] = true;
        }	
		for(int c = 0; c < 4; c++){
        	for(int d = 0; d < 13; d++){
        		if(!box[c][d]){
                    if(c == 0)System.out.printf("S %d\n",d+1);
                    else if(c == 1)System.out.printf("H %d\n",d+1);
                    else if(c == 2)System.out.printf("C %d\n",d+1);
                    else if(c == 3)System.out.printf("D %d\n",d+1);
        		}
        	}
		}
	}
}