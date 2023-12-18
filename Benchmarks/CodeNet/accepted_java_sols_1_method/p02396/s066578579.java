import java.util.Scanner;

class Main {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int i = 0;
    	while(in.hasNext()) {
    		int x = in.nextInt();
    		if (x == 0) {
    			break;
    		}
    		i++;
    		System.out.printf("Case %d: %d\n", i, x);
    	}
    }
}