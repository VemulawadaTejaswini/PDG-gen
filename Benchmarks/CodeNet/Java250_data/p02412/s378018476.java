import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    while(true){ 
    	
    	int n = scan.nextInt();
        int x = scan.nextInt();
    	if(n==0 && x==0){
	 		break;
	 	}
    	else{
        int first;
        int second;
        int third;
        int count = 0;

        for(first = 1; first <= (n-2); first++){
        	 for(second = (first+1); second <= (n-1); second++){
        	 	for(third = (second+1); third <= n; third++) {
      
        	 	if(n==0 && x==0){
        	 		break;
        	 	}
        		if((first + second + third) == x){
        			count++;
        		}
        		}
        	}
        }
        System.out.println(count);
    	}
    }
 	}
}