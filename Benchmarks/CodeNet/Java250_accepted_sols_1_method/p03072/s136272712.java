import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int ans = 1;
        int highest = sc.nextInt();
        for(int i = 1; i < num; i++){
            int height = sc.nextInt();
            if(height >= highest){
                ans++;
                highest = height;
            }
        }

        System.out.println(ans);
    }
}