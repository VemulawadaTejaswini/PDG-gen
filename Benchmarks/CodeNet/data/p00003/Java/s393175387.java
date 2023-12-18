import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i=0; i<N; i++){
            String l = br.readLine();
            Scanner sc = new Scanner(l);
            
            int a[];
            a = new int[3];
            for (int j=0; j<3; j++){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            if ((a[0]*a[0] + a[1]*a[1]) == a[2]*a[2]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}