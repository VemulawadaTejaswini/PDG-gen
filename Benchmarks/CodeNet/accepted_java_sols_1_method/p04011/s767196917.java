import java.util.Scanner;

/**
 * Created by hirai on 2016/08/30.
 */
public class Main {

    /*
    public static final void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println((scanner.nextInt()
                + scanner.nextInt()
                + scanner.nextInt())
                + " "
                + scanner.next());
    }
    */
    public static final void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();
        final int x = scanner.nextInt();
        final int y = scanner.nextInt();

        int sum = 0;
        for(int i=0;i<n;i++){
            if(i<k){
                sum += x;
            }else{
                sum += y;
            }
        }
        System.out.println(sum);
    }
}
