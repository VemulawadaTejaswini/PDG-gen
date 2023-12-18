import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = 0;
        double [] a = new double [n];
        while(x<n){
            a[x] = sc.nextDouble();
            x++;
        }
        int count = 0;
        for(int i = 0; i<n-1;i++){
            for(int j =i+1;j<n;j++){
                double res = a[i]*a[j];
                if(res%1 ==0 && a[i]!=a[j]){
                    count++;
                }


            }
        }
        System.out.println(count);
    }
}