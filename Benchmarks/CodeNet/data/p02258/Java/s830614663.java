import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int a[];
    static int answer;
    static int minv;
    static int maxv;

    public static void main(String[] args) {
        read();
        solve();
        System.out.println(answer);
    }

    public static void read(){
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0;i<n;i++){
            a[i]= sc.nextInt();
        }
        minv = a[0];
        maxv = a[1];
        answer = a[1]-a[0];
    }

    public static void solve(){
        for(int i =1;i<n;i++){
            if(a[i]>maxv){
                maxv = a[i];
                answer = maxv-minv;
            }
            if(minv>a[i]){
                minv=a[i];
            }

        }
    }
}