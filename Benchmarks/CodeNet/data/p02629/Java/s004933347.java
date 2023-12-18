import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder list = new StringBuilder();

        while(n != 0){
            list.append(getChar((int) (n%26)));

            n = n/26;

        }
        String ans = list.toString();
        System.out.println(ans);



    }
    private static char getChar(int tmp){

        return (char) (tmp +96);
    }

}