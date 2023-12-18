import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i <= n;++i){
            int x = i;
            if(x % 3 == 0) sb.append(' ').append(i);
            else while(x > 0) {
                if (x % 10 == 3){
                    sb.append(' ').append(i);
                    break;
                }
                x /= 10;
            }
        }
        System.out.println(sb);
    }

}