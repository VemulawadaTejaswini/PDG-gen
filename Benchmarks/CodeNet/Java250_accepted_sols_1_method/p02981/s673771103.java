import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input N A B
        Scanner sc = new Scanner(System.in);
        int numPerson = sc.nextInt();
        int priceA = sc.nextInt();
        int priceB = sc.nextInt();
        if(numPerson * priceA < priceB){
            System.out.println(numPerson * priceA);
        } else {
            System.out.println(priceB);
        }
    }
}