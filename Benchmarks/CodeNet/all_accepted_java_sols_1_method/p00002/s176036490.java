import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ab = a + b;

            String st = ab +"";
            System.out.println(st.length());
        }
    }
}