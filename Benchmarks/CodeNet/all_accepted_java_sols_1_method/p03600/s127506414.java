import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        long[][]a=new long[n][n];
        long[][]b=new long[n][n];
        for(int i=0;i<n;++i)
            for(int j=0;j<n;++j)a[i][j]=b[i][j]=scan.nextInt();
        for(int k=0;k<n;++k)
            for(int i=0;i<n;++i)
                for(int j=0;j<n;++j)
                    b[i][j]=Math.min(b[i][j],b[i][k]+b[k][j]);
        if(!Arrays.deepEquals(a,b)){
            System.out.println(-1);
            return;
        }
        long t=0;
        for(int i=0;i<n;++i)
            for(int j=0;j<n;++j){
                boolean nec=true;
                for(int k=0;k<n;++k)
                    if(i!=k&&j!=k&&a[i][k]+a[k][j]==a[i][j])nec=false;
                if(nec)t+=a[i][j];
            }
        System.out.println(t/2);
    }
}
