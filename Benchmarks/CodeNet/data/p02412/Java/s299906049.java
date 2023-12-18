import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int way;
        while(true){
            way = 0;
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n == 0 && x == 0) break;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i == j) break;
                    for(int k=1;k<=n;k++){
                        if(i == k) break;
                        if(j == k) break;
                        int sum = i + j + k;
                        if(sum == x ) way++;
                    }
                }
            }
            System.out.printf("%d\n",way);
        }
    }
}
