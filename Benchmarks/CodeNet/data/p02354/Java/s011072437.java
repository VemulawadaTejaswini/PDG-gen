import java.util.Scanner;

public class Main {
    //http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=DSL_3_A
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int S = in.nextInt();//target
        int a[] = new int[n+1];
        for(int i = 0; i<n ;i++){
            a[i] = in.nextInt();
        }
        //use two pointer
        int p1 = 0, p2 = 0;
        int min = n+1;//smallest size
        for(p1  =0; p1<n ;p1++){
            //p2 = p1;
            int sum = 0;
            while(sum<S){
                if(p2==n) break;
                sum+= a[p2];
                p2++;
            }
            if(sum>=S)
                if(min>(p2-p1)) min  = p2-p1;
        }
        if(min == n+1) System.out.println(0);
        else System.out.println(min-1);

    }

}

