import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        while(true){
            int n = stdIn.nextInt();
            int x = stdIn.nextInt();

            if(n == 0 && x == 0){
                break;
            }

            int counter = 0;
            for(int i=1; i<=n-1; i++){
                for(int j=i+1; j<=n; j++){
                    if(x - (i + j) <= n && j < x - (i + j)){
                        counter++;
                        continue;
                    }
                }
            }

            System.out.println(counter);
        }
    }
}
