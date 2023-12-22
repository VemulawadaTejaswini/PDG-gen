import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int[] w = new int[z];
        for(int i = 0; i < z; i++){
            w[i] = i+1;
        }
        int n = sc.nextInt();
        for(int j = 0; j<n; j++){
            String s = sc.next();
            String[] ab = s.split(",");
            int a = Integer.parseInt(ab[0])-1;
            int b = Integer.parseInt(ab[1])-1;
            int c = w[a];
            w[a] = w[b];
            w[b] = c;
        }
        for(int k = 0; k < z; k++){
            System.out.println(w[k]);
        }
        sc.close();
    }
}
