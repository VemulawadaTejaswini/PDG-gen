import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] ary = new long[200000];
        
        for(int i=0; i<n; i++){
            ary[i] = Long.parseLong(sc.next());
        }

        for(int i=k; i<n; i++){
            if(ary[i] > ary[i - k]){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}