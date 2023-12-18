import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        new aoj0296().doIt();
    }
    class aoj0296 {
        void doIt(){
        	int sum = sc.nextInt();
        	sum = sum + sc.nextInt()*5;
        	sum = sum + sc.nextInt()*10;
        	sum = sum + sc.nextInt()*50;
        	sum = sum + sc.nextInt()*100;
        	sum = sum + sc.nextInt()*500;
        	if(sum >= 1000)System.out.println(1);
        	else System.out.println(0);
        }
    }
}