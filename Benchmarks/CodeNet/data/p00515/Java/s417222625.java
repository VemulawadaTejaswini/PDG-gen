import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        new aoj().doIt();
    }
    class aoj {
        void doIt(){
        	int sum = 0;
        	for(int i = 0;i < 5;i++){
        		sum = sum + Math.max(40, sc.nextInt());
        	}
        	System.out.println(sum/5);
        }
    }
}