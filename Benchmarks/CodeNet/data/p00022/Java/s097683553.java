import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int[] list=new int[n];
            for(int i=0;i<n;i++) {
                list[i]=sc.nextInt();
            }
            int[] sum=new int[n+1];
            sum[0]=0;
            for(int i=0;i<n;i++) {
                for(int j=i;j<n;j++) {
                    sum[j+1]=Math.max(sum[j]+list[j],sum[j+1]);
                }
            }
            int max=Integer.MIN_VALUE;
            for(int i:sum) {
                max=Math.max(max, i);
            }
            System.out.println(max);
        }
    }
}
