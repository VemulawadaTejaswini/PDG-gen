import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        for(int a=0;;a++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int count = 0;
            if(n==0&&x==0){
                break;
            }
            for(int i=1;i<=n-2;i++){
                for(int j=i+1;j<=n-1;j++){
                    for(int k=j+1;k<=n;k++){
                        int sum = 0;
                        sum = i + j + k;
                        if(sum==x){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}


