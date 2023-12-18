import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] str = sc.nextLine().split("");
            if(Integer.parseInt(str[0]) == 0){
                break;
            }
            int ans = 0;
            for(int i = 0; i < str.length; i++){
                ans += Integer.parseInt(str[i]);
            }
            System.out.println(ans);
        }
    }
}