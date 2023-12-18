import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        int bit = 0;
        for(int i=0; i<num; i++){
            bit |= Integer.parseInt(sc.next());
        }
        System.out.println(Integer.numberOfTrailingZeros(bit));
    }
}