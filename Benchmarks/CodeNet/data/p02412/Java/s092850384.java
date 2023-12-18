import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] result, n, x;
        result = new int[300];
        n = new int[300];
        x = new int[300];
        int i, j, k;
        int cnt = 0;

        while(true){
            n[cnt] = sc.nextInt();
            x[cnt] = sc.nextInt();
            if(n[cnt] == 0 && x[cnt] == 0)
                break;
            result[cnt] = 0;
            for(i=1; i<n[cnt]-1; i++){
                for(j=i+1; j<n[cnt]; j++){
                    for(k=j+1; k<=n[cnt]; k++){
                        if(i + j + k == x[cnt])
                            result[cnt]++;
                    }
                }
            }
            cnt++;
        }
        for(i=0;i<cnt; i++){
                System.out.println(result[i]);
            }
        sc.close();
    }
}
