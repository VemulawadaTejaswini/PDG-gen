import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[100000];
        long sum = 0;
        for(int i = 0;i<n;i++) {
            int a = sc.nextInt();
            sum+=a;
            count[a-1]++;
        }
        int q = sc.nextInt();
        int[] b = new int[q];
        int[] c = new int[q];
        for(int i = 0;i<q;i++){
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        for(int i = 0;i<q;i++){
            sum-=count[b[i]-1]*b[i];
            sum+=count[b[i]-1]*c[i];
            count[c[i]-1]+=count[b[i]-1];
            count[b[i]-1]=0;
            System.out.println(sum);
        }
    }
}
