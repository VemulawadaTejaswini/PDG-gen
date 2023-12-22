import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab[] = new int[2];

        while(true) {
            ab[0] = scanner.nextInt();
            ab[1] = scanner.nextInt();
            if(ab[0] == 0 && ab[1] == 0) {
                break;
            }
            Arrays.sort(ab);
            System.out.println(ab[0] + " " + ab[1]);
        }
    }
}