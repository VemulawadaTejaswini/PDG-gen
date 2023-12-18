import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int lst[] = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            lst[i] = Integer.parseInt(scan.next());
        }
        for(int i = 0; i < n-2; i++){
            if((lst[i+1]<lst[i]&&lst[i+2]<lst[i+1])||(lst[i+1]>lst[i]&&lst[i+2]>lst[i+1])){
                ans++;
            }
        }
        System.out.println(ans);
    }
}