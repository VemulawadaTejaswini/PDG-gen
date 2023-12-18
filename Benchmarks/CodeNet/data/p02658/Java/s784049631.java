import java.util.*;

public class Main {
	public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 個数
        sc.nextLine();

        Long[] kakeru = new Long[N];
        Long ans = (long) 1;

        int flag = 0;

        for (int i = 0; i < N; i++){
            kakeru[i] = sc.nextLong();
            if (kakeru[i] == 0){
                flag = 1;
                break;
            };
            ans = ans*kakeru[i];

        }
        sc.close();

        Long compare = (long) 1000000000000000000L;

        if (flag == 1){
            System.out.println("0");
        } else if(ans < compare){
            System.out.println(ans);
        } else {
            System.out.println("-1");
        }
    }
}
