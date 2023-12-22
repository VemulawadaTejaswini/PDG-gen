import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt(),x = sc.nextInt(),c = 0;
            if(n == 0 && x == 0) break;
            for(int i = 1,l = n - 2;i <= l;++i){
                for(int j = i + 1,m = n - 1;j <= m;++j){
                    for(int k = j + 1;k <= n;++k){
                        if(i + j + k == x) ++c;
                    }
                }
            }
            System.out.println(c);
        }
    }

}