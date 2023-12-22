import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    int cou = 0;
	    for(int i=0; i<=x; i++) {
	    if(2*i + 4*(x-i) == y) {
	    	cou++;
	    }
	    }
	    if(cou>0){
	    	System.out.println("Yes");
	    }else{
	    	System.out.println("No");
	      }
	}
	}