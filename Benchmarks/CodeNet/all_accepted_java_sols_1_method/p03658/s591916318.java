import java.util.Scanner;
class Main {
	public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] snake = new int[n];
    for(int i=0; i<n; i++) {
    	snake[i]= scan.nextInt();
    }
    for(int i=0; i<n-1; i++) {
    	for(int j = 0; j < n-1-i; j++) {
    		if(snake[n-1-j]>snake[n-2-j]) {
        		int l = snake[n-1-j];
        		snake[n-1-j]=snake[n-2-j];
        		snake[n-2-j]=l;
    		}
    	}
    }
    int max = 0;
    for(int i=0; i<k; i++) {
    	max+=snake[i];
    }
    System.out.println(max);
	}
}