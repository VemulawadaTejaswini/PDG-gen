import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean ans = false;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i*j == N) ans = true;
            }
        }
        System.out.println(ans? "Yes": "No");
    }
}