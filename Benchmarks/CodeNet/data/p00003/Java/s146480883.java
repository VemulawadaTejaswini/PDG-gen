
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String[] array = sc.nextLine().split("[\\s]");
            int n1 = Integer.parseInt(array[0]);
            int n2 = Integer.parseInt(array[1]);
            int n3 = Integer.parseInt(array[2]);
            if(Math.pow(n1, 2) + Math.pow(n2, 2) == Math.pow(n3, 2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }

}