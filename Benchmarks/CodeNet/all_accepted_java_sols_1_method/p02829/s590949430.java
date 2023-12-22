import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b;
	    Scanner input = new Scanner(System.in);
	    a = input.nextInt();
	    b = input.nextInt();
	    if(a == 1 && b ==2 || a == 2 && b == 1){
            System.out.println(3);
        }
        if(a == 3 && b ==2 || a == 2 && b == 3){
            System.out.println(1);
        }
        if(a == 3 && b ==1 || a == 1 && b == 3){
            System.out.println(2);
        }
    }
}
