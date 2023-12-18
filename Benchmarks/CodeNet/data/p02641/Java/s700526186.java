import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int x1=x;
        int n =sc.nextInt();
        boolean [] arr = new boolean [120];
        for (int i = 0; i <n ; i++) {
            int y =sc.nextInt();
            arr[y]=true;
        }
        int ans1 =0,ans2 = 0;
        int cn1=0,cn2=0;
        for (int i = 0; i < arr.length; i++) {
            cn1++;
            if(!arr[x]){
                ans1=x;
                break;
            }
            x--;
        }for (int i = 0; i < arr.length; i++) {
            cn2++;
            if(!arr[x1]){
                ans2=x1;
                break;
            }
            x1++;
        }
        if(cn1<cn2){
            System.out.println(ans1);
        }
        else if(cn2<cn1) System.out.println(ans2);
        else
        System.out.println(Math.min(ans1,ans2));
    }
}