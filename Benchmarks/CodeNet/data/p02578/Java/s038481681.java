import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        int ar[]=new int[test];
        for (int i = 0; i < test; i++) {
            ar[i]=in.nextInt();
        }
        int ans=0;
        int max=ar[0];
        for (int i = 1; i < test; i++) {
            if(max<ar[i])max=ar[i];
            if(ar[i]<ar[i-1]){
                ans=ans+(max-ar[i]);
            }
        }
        System.out.println(ans);
}
}