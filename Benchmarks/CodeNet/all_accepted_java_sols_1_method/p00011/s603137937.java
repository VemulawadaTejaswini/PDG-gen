import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int ans[] = new int[w];
        for(int i = 0; i<w; i++){
            ans[i] = i+1;
        }
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String t = sc.next();
            String p[] = t.split(",");
            int a = Integer.parseInt(p[0]);
            int b = Integer.parseInt(p[1]);
            int tmp = ans[a-1];
            ans[a-1] = ans[b-1];
            ans[b-1] = tmp;
        }
        for(int i = 0; i<w; i++){
            System.out.println(ans[i]);
        }
        sc.close();
    }
}
