import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s[] = new String[n];

        for(int i = 0; i < n; i++){
                s[i] = scan.next();
        }
        Arrays.sort(s);

        int ans = 1;
        for(int i = 0; i < n - 1; i++){
            if(!(s[i].equals(s[i+1]))){
                ans++;
            }
        }

        System.out.println(ans);
    }
}