import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, n, x, ix, jx, kx, count[], m;
        count = new int[100000];

        m = 0;
        while(true){

            count[m]=0;
            n = sc.nextInt();
            x = sc.nextInt();

            if(n == 0 && x == 0){break;}

            for(i=1;i<=n;i++){
                ix = x;
                ix -= i;

                for(j=i;j<=n;j++){ //jはiから始まる
                    jx = ix;
                    jx -= j;
                    if(j == i){continue;}

                    for(k=j;k<=n;k++){ //kはjから始まる
                        kx = jx;
                        kx -= k;
                        if(k==j){continue;}
                        if(k==i){continue;}

                        if(i + j + k == x){
                            count[m]++;
                        }
                    }
                }
            }
            m++;
        }

        for(i=0;i<m;i++){
            System.out.println(count[i]);
        }
    }
}

