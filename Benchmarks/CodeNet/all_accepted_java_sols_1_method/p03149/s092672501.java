import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[4];
        for (int i = 0; i < 4; i++){
            num[i] = input.nextInt();
        }
        Arrays.sort(num);
        if (num[0] == 1 &&
            num[1] == 4 &&
            num[2] == 7 &&
            num[3] == 9){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    }
}