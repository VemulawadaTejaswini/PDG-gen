import java.util.Scanner;
    
class Main {    
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),zero=0;
        long[] arr = new long[n];
        long ans = 1;
        for(int i=0;i<n;++i) {
            arr[i] = in.nextLong();
            if(arr[i]==0) zero=1;
        }
        if(zero==1) {
            System.out.println("0");
            return ;
        }
        
        for(int i=0;i<n;++i) {
            if(ans <= 1000000000000000000L/arr[i]) ans = ans*arr[i];
            else {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(ans);
    }
}