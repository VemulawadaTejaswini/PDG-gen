import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0;i < n;i++){
            int damage = sc.nextInt();
            sum += damage;
        }
        System.out.println(sum>=h?"Yes":"No");
    }
}