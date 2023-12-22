import java.util.Scanner;
class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String[] ar = N.split("");
        int sum=0;
        
        for(int i=0;i<N.length();i++){
            sum += Integer.parseInt(ar[i]);
        }
        String ans="No";
        if(sum%9==0) ans = "Yes";
        System.out.println(ans);
    }
}