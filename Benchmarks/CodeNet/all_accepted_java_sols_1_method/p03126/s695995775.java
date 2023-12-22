import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] count = new int[m];
        int k;
        int A;
        for(int i=0;i<n;i++){
            k = Integer.parseInt(sc.next());
            for(int j=0;j<k;j++){
                A = Integer.parseInt(sc.next())-1;
                count[A]++;
            }
        }
        int res = 0;
        for(int i=0;i<m;i++){
            if(count[i]==n)res++;
        }
        System.out.println(res);
        sc.close();
    }
    
}