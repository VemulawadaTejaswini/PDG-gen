import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] stf = new double[n];

        for(int i = 0;i < n;i++){
            stf[i] = sc.nextDouble();
        }

        Arrays.sort(stf);

        for(int i = 0;i < n-1;i++){
            stf[i+1] = (stf[i]+stf[i+1])/2.0;
        }
        
        System.out.println(stf[n-1]);

    }
}