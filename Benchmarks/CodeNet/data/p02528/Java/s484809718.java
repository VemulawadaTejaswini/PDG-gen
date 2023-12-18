import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i=0;
        int[] length = new int[n];
        for(; i<n; i++){
            length[i] = sc.nextInt();
        }

        Arrays.sort(length);
        i=0;
        while(true){
            System.out.print(length[i]);
            if(++i==n){
                System.out.print("\n");
                break;
            }
            else{
                System.out.print(" ");
            }
        }

        sc.close();
    }
}