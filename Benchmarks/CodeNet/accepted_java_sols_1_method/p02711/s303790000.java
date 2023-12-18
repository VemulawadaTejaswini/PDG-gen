import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        if(n%10 == 7 || (n%100)/10 == 7 || n/100 == 7){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}