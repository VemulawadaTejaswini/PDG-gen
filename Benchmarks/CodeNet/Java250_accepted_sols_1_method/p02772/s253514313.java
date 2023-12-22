import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n= stdIn.nextInt();
		int[] h = new int[n];
	    for(int i=0 ; i<n ; i++){
	        h[i] = stdIn.nextInt();
	    }
	    int i;
	    for(i=0 ; i<n ; i++){
	        if(h[i] %2 ==0){
	            if((h[i]%3==0||h[i]%5==0)){
	            }else{
	                break;
	            }
	        }
	    }
	    if(i==n)    System.out.println("APPROVED");
	    else    System.out.println("DENIED");
	}
}
