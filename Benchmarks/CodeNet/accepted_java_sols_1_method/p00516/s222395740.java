import java.util.Scanner;
//0593
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),l[]=new int[n],r[]=new int[n],max=0,a=0;
        for(int i=0;i<n;i++) {
            l[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++) {
            int t=sc.nextInt();
            for(int j=0;j<n;j++) {
                if(l[j]<=t) {
                    r[j]++;
                    if(max<r[j]) {
                        max=r[j];
                        a=j;
                    }
                    break;
                }
            }
        }
        System.out.println(a+1);
    }
}
