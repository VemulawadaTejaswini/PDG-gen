import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ary = new int[n + 1];
        int x=1, y=1, z=1;
        for(x=1; x*x<n; x++){
            for(y=1; x*x+y*y+x*y<n; y++){
                for(z=1; x*x+y*y+z*z+x*y+y*z+z*x<=n; z++){
                    ary[x*x+y*y+z*z+x*y+y*z+z*x]++;
                }
            }
        }
        for(int i=1; i<=n; i++){
            System.out.println(ary[i]);
        }
    }
}