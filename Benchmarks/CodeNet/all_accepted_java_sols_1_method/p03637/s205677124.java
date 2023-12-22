import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[3];
        int n = 0;
        for(int i = 0; i<N; i++) {
            n = sc.nextInt();
            if(n%4==0) a[0]++;
            else if(n%2==0) a[1]++;
            else a[2]++;
        }
        if(a[0]>=a[2]) {
            System.out.println("Yes");
        }else if(a[2]-a[0]==1 && a[1] == 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}