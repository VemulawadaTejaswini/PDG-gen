import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n==0 && x==0) break;
            int count=0;
            for(int i=1; i<=n; i++){
                for(int j=1; i>j; j++){
                    for(int k=1; j>k; k++){
                        if(i+j+k==x) count++;
                    }
                }
            }
            System.out.println(count);

        }
    }
}
