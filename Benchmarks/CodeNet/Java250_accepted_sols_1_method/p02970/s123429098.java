
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int d= in.nextInt();
        int cover = d*2+1;
        int ans = n/cover;
        if(n%cover==0)
            System.out.println(ans);
        else if(n>d && n%cover>0){
            ans++;
            System.out.println(ans);
        }
        else
            if(n<=d){
                System.out.println(1);
            }

    }
}
