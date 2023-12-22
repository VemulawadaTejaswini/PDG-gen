import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] box = sc.nextLine().split("");
        int ans=0;
        for(String num:box){
            if(Integer.parseInt(num)==1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}