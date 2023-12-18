import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
 while (in.hasNext()) {
    int number = sc.nextInt();
 
    int factorial = number;
    for(int i = 1; i < number; i++){
        factorial = factorial*(number - i);
    }
 
    System.out.println(factorial);
    }
}
    

}