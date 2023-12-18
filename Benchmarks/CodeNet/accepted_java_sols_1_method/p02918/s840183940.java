import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        char s[] = stdIn.next().toCharArray();
        long ans = 0;
        for(int i= 0; i+1 < n; i++){
            if(s[i] == s[i+1])
                ans++;
        }
        System.out.println((int)Math.min(k*2 + ans ,n-1  ));

    }
}
