import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
            sum+=x[i];
        }
        int res1_ave = sum/n;
        int res2_ave = sum/n + 1;
        int res1 = 0;
        int res2 = 0;
        for(int i=0;i<n;i++){
            res1 += (x[i]-res1_ave)*(x[i]-res1_ave);
            res2 += (x[i]-res2_ave)*(x[i]-res2_ave);
        }
        if(res1>res2){
            System.out.println(res2);
        }
        else{

            System.out.println(res1);
        }



    }
}
