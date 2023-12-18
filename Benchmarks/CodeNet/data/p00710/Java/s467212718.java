import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n==0 && r==0) break;
            int i,j;
            int huda[] = new int[n];
            for(i=0;i<n;i++){
                huda[i] = n-i;
            }
            for(i=0;i<r;i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                int rep[] = new int[c];
                for(j=0;j<c;j++){
                    rep[j] = huda[j+p];
                }
                for(j=p-1;j>=0;j--){
                    huda[j] = huda[j+c];
                }
                for(j=0;j<c;j++){
                    huda[j] = rep[j];
                }
            }
            System.out.println(huda[0]);
        }
    }
}

