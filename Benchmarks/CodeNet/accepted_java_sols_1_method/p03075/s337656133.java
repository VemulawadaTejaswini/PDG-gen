import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minNum = sc.nextInt();
        sc.nextInt();
        sc.nextInt();
        sc.nextInt();
        int maxNum = sc.nextInt();
        int limit = sc.nextInt();

        String ans;
        if(maxNum - minNum > limit){
            ans = ":(";
        }else{
            ans = "Yay!";
        }
        System.out.println(ans);
    }
}