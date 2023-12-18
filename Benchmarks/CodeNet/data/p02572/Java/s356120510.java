import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();

        }
        sc.close();
        Long a = 0l;
        Long r = 0l;
        

        for (int i = 0; i<n-1; i++){
            for(int j=i+1; j<n;j++){
                
                a = a + num[j];
                // r = r + (num[i] * num[j]) % ((long)Math.pow(10,9) + 7);
            }
            // System.out.println(a);
            r = (r + num[i] * a) % ((long)Math.pow(10,9) + 7);
            a = 0l;

        }

        System.out.println(r);

        
}
}