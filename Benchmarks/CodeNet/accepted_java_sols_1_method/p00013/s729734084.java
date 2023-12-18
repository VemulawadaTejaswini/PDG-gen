import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            Stack<Integer> carNumbers = new Stack<Integer>();
            while (sc.hasNextInt()) {
                int carNumber =sc.nextInt();
                if(carNumber!=0){
                    carNumbers.push(carNumber);
                }else{
                    System.out.println(carNumbers.pop());
                }
            }
        } finally {
            sc.close();
        }
    }
}