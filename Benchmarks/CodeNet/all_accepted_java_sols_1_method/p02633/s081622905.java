import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; ; i++) {
            if(i * n % 360 == 0) {
                System.out.println(i);
                break;
            }
        }
        in.close();
    }
}