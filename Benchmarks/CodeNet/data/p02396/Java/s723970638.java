import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int x;
    	int i=1;
    	while(sc.hasNext()){
    		x = sc.nextInt();

    		System.out.println("Case " + i + ": " + x);
    		i++;
    	}

    }
}