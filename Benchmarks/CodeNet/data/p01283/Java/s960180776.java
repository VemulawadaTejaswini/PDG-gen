import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            if(N==0)break;
            int[] a = new int[N];
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }
            double min = 1<<29;
            double e = 1e-10;
            int x=0,y=0,z=0;
            for (int i = 0; i <= 15; i++) {
                for (int j = 0; j <= 15; j++) {
                    for (int k = 0; k <= 15 ; k++) {
                        double H = calc(a,i,j,k);
                        if(min > H+e){
                            min = H+e;
                            x=i;
                            y=j;
                            z=k;
                        }
                    }
                }
            }
            System.out.println(x+" "+y+" "+z);
        }
    }
    static int m = 256;
    static double calc(int[] I,int s,int a,int c){
        double res = 0.0;
        int[] o = new int[I.length];
        int[] r = new int[I.length+1];
        r[0]=s;
        for (int j = 1; j < r.length; j++) {
            r[j] = (a*r[j-1]+c)%m;
        }
        for (int j = 0; j < o.length; j++) {
            o[j] = (I[j]+r[j+1])%m;
        }
        for (int j = 0; j < 256; j++) {
            double cnt=0;
            for (int j2 = 0; j2 < o.length; j2++) {
                if(o[j2]==j)cnt++;
            }
            if(cnt!=0){
                double d = cnt/o.length*Math.log(cnt/o.length);
                res -= d;
            }
        }
        return res;
    }
}