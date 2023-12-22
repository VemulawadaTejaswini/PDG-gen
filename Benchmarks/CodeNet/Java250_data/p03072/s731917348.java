import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int b[] = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = scan.nextInt();
        }
        int count = 0;

        for (int y=0; y<N; y++){
            int sum = 0;

            for(int x=0;x<y;x++){
                
                if(b[y] >= b[x]){
                    sum = sum +1;
                }
            
            }
            if (sum == y){
                count++;
            }

        }

        System.out.println(count);
    }
}
