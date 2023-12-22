import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int i = 1, j = 2, k = 3, co = 0;

            if(n==0 && x==0) break;
            for(i=1; i<=n-2; i++){
                for(j=i+1; j<=n-1; j++){
                    for(k=j+1; k<=n; k++){
                        if(i+j+k == x) co++;
                    }
                }
            }

            System.out.println(co);
            
        }
    }   
}
