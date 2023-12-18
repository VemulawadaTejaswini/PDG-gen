import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    void run(){
	int n = sc.nextInt();
	for(int i=0; i<9; i++){
	    n -= sc.nextInt();
	}
	System.out.println(n);
    }
}