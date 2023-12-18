import java.util.Scanner;

public class Main{
    
    public static void check(int c){
        if(c%3 == 0){
            System.out.print(" "+c);
            return;
        }
        if(c%10 == 3){
            System.out.print(" "+c);
        }
    }

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
		    check(i);
		}
		
	}

}
