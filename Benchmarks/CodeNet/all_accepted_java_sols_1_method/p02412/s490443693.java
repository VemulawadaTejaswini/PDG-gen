import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int n = sc.nextInt();
        int x = sc.nextInt();
        while(n!=0 || x!=0){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    for(int k=1;k<=n;k++){
                        if(i+j+k==x){
                            if(i<j && j<k){
                                cnt++;
                            }
                        }
                    }
                }
            }
            System.out.println(cnt);
            cnt=0;
            n=sc.nextInt();
            x=sc.nextInt();
        }
        sc.close();
    }
}
