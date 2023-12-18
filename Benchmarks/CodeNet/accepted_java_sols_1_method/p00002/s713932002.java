import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner angi = new Scanner(System.in);
        while(angi.hasNextInt()) {
            System.out.println(String.valueOf(angi.nextInt() + angi.nextInt()).length());
        }
    }
}