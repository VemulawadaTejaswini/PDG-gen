import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double output=0;
        for(int i=0;i<n;i++){
            output+=sc.nextDouble()*(sc.next().equals("JPY")?1: 380000);
        }
        System.out.println(output);
    }

}
