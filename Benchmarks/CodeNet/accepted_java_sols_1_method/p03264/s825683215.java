import java.util.Scanner;

class Main{
    static Scanner sc =new Scanner(System.in);
    public static void main(String args[]){
        int k=sc.nextInt();
        int ans=0;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                if(i%2==0&&j%2==1){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}