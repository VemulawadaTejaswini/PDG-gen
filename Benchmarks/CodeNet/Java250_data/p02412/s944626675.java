import java.util.Scanner;

class NumClass{
	public int max;
	public int sum;
}
	

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int i,j,k;
	  	int count;
	  	
	  	NumClass num = new NumClass();
	  	
	  	while(true){
	  		count = 0;
	  		num.max = scanner.nextInt();
	  		num.sum = scanner.nextInt();
		  	
		  	if(num.max == 0 && num.sum == 0)
		  		break;
		  	
		  	for(i = 1; i <= num.max - 2 ; i ++){
		  		for( j = i + 1; j <= num.max - 1; j ++ ){
		  			for(k = j + 1; k <= num.max ; k ++){
		  				if(i + j + k == num.sum) {
		  					count ++;
		  					if(i == k || j == k || i == j)
		  						count --;
		  				}
		  			}
		  		}
		  	}

			System.out.println(count);
	  		
	  	}
        scanner.close();
  }
}
