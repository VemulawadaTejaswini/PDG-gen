import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        for(int i=A;i<=B;i++){
            if(i%10==0) continue;
            StringBuilder sb = new StringBuilder();
            int j=i;
            while(j>0){
                sb.append(j%10);
                j=j/10;
            }
            String s1 = sb.toString();
            String s2 = sb.reverse().toString();
            if(s1.equals(s2)) ans++;
        }

        System.out.println(ans);
    }
}

