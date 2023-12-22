import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int kind = sc.nextInt();
        int[] di = new int[kind];

        int[] count = new int[n];
        for(int i = 0; i<n; i++){
            count[i] = 0;
        }

        for(int i = 0; i<kind; i++){
            di[i] = sc.nextInt();
            for(int j = 0; j<di[i]; j++){
                count[sc.nextInt() - 1]++;
            }
        }

        int trickCount = 0;
        for(int i = 0; i<n; i++){
            if(count[i] == 0){
                trickCount++;
            }
        }

        System.out.println(trickCount);
    }
}