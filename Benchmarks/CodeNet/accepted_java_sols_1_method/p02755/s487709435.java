import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split(" ");
        long A = Long.parseLong(S[0]);
        long B = Long.parseLong(S[1]);
        sc.close();

        long temp = 0;
        for(int i = 1; i <= 1262; i++){
            long a = (long) (i * 0.08);
            if(a != A){
                continue;
            }
            long b = (long) (i * 0.1);
            if(b == B){
                temp = i;
                break;
            }
        }

        if(temp == 0){
            System.out.println("-1");
        }else{
            System.out.println(temp);
        }
    }

}
