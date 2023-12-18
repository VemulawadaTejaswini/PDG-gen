import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n,x,c,a=0;
            n = sc.nextInt();
            x = sc.nextInt();
            for(int i=1;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    c = x - i - j;
                    if(c>j&&c<=n){
                        a++;
                    }
                }
            }
            System.out.println(a);
        }
    }
}

