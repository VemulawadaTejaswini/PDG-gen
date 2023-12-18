import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	int n,x,max;
    	int count = 0;
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		n = sc.nextInt();
        	x = sc.nextInt();
        	if(n ==0 && x ==0){
        		break;
        	}
        	max = n >= x ? x:n;

        	for(int i = 1; i <= max-2 ;i++){
        		for(int j = i+1; j <= max-1 ;j++){
        			for(int k = j+1; k <= max ;k++){
        				if(i+j+k == x){
        					count++;
        					break;
        				}
        			}
        		}
        	}
            System.out.println(count);
            count = 0;
    	}

    }
}