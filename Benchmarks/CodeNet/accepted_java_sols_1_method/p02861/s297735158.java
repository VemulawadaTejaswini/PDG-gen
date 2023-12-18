import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[][] map = new int[a][2];
        double ans=0;
        for(int i=0;i<a;i++){
            map[i][0]=scan.nextInt();
            map[i][1]=scan.nextInt();
        }
        int k = 1;
        for(int i=1;i<a-1;i++){k*=i;}
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                ans += Math.sqrt((double)Math.pow(map[i][0]-map[j][0],2)+(double)Math.pow(map[i][1]-map[j][1],2));
            }
        }
        int p = 1;
        for(int i=1;i<a+1;i++){p*=i;}
        ans/=p;
        ans=ans* 2 * (a-1)*k;
        System.out.println(ans);
    }
}