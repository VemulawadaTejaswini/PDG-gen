import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x+y > t || t%2 != (x+y)%2){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
