import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] result = new int[500];
        int resultcnt=0;

        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n==0 && r==0)
                break;
            int[] hana = new int[n];
            int[] copy = new int[n];
            for(int i=0; i<n; i++){
                hana[n-1-i] = i+1;
                
            }
            
            for(int i=0; i<r; i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                int cnt=0;
                if(i==0){
                    for(int j=p-1; j<p+c-1; j++){
                        copy[cnt] = hana[j];
                        cnt++;
                    }
                    for(int k=0; k<p-1; k++){
                        copy[cnt] = hana[k];
                        cnt++;
                    }
                    for(int m=p+c-1; m<n;m++){
                        copy[cnt] = hana[m];
                        cnt++;
                    }    
                }else{
                    for(int a=0; a<n; a++)
                        hana[a] = copy[a];
                    for(int j=p-1; j<p+c-1; j++){
                        copy[cnt] = hana[j];
                        cnt++;
                    }
                    for(int k=0; k<p-1; k++){
                        copy[cnt] = hana[k];
                        cnt++;
                    }
                    for(int m=p+c-1; m<n;m++){
                        copy[cnt] = hana[m];
                        cnt++;
                    }
                }
            }
            result[resultcnt] = copy[0];
            resultcnt++;
        }

        for(int i=0; i<resultcnt; i++){
            System.out.println(result[i]);
        }

        sc.close();

    }
}
