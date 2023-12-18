import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] a = new boolean[2001];
        a[0] = true;

        for(int i = 0; i < n; i++){
            int q = sc.nextInt();

            for(int j = 2000 - q; j >= 0; j--){
                if(a[j]){
                    a[j+q] = true;
                }
            }
        }

        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            if(a[sc.nextInt()]){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}

