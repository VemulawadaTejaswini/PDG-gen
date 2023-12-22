import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int all = 0;
        String flag = "No";
        int num[] = new int[n];
        double check = 0.0;
        //int x = 1;
        //System.out.println(x/2);

        for(int i = 0; i < n ; i++){
            int vote = sc.nextInt();
            num[i] = vote;
            all += vote;
            //System.out.println(num[i]);
        }
        //System.out.println(all);
        check = (double)all/(4*m);

        for(int i = 0; i < n; i++){
            if(num[i] >= check){ 
                cnt++;
                //System.out.println(num[i]);
            }
        }

        //System.out.println(cnt);
        if(cnt>=m){
            flag = "Yes";
        }
        System.out.println(flag);
    }
}