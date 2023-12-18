import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input A B
        // A+B,A-B,AxB max
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int retNum = 0;
        if(numA + numB < numA - numB){
            if(numA - numB < numA * numB){
                retNum = numA * numB;
            } else {
                retNum = numA - numB;
            }
        } else {
            if(numA + numB < numA * numB){
                retNum = numA * numB;
            } else {
                retNum = numA + numB;
            }
        }
        System.out.println(retNum);
    }
}
