import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sum=0;
        while(n!=0||x!=0){
            for(int i=n;i>=3;i--){
                for(int j=i-1;j>=2;j--){
                    if(i==j) continue;
                    for(int k=j-1;k>=1;k--){
                        if(i==k||j==k) continue;
                        if(i+j+k==x) sum++;
                    }
                }
            }
            System.out.println(sum);
            sum = 0;
            n = sc.nextInt();
            x = sc.nextInt();
        }
    }
}
