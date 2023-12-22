import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 空白入力
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // 空白入力

        int[] a = new int[200010];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }

        int ma = 0;
        for(int i=1;i<n;i++){
            if(a[ma] < a[i]){
                ma = i;
            }
        }

        int temp;
        if(ma > 0){
            temp = 0;
        }else{
            temp = ma + 1;
        }

        for(int i=0;i<n;i++){
            if(ma == i){
                for(int j=0;j<n;j++){
                    if(ma != j){
                        if(a[temp] < a[j]){
                            temp = j;
                        }
                    }
                }
                System.out.println(a[temp]);
            }else{
                System.out.println(a[ma]);
            }
        }
    }
}
