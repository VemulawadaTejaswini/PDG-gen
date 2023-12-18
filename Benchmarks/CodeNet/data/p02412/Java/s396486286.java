import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        for(;;){
            int n = sc.nextInt();
            int x = sc.nextInt();
            sc.nextLine();
            
            int cnt = 0;
            
            if (n+x == 0) break;
            
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if (i==j) break;
                    for(int k=1;k<=n;k++){
                        if ((i==k) || (j==k)) break;
                        if ((i+j+k) == x) cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
