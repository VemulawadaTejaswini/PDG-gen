import java.util.Scanner;

public class Main{


    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int men = a * b;
    	int hen = a * 2 + b * 2;
        System.out.println(men + " " + hen);
    }

}