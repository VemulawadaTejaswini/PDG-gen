import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int card[] = new int[n];
            for(int i=0; i<n; i++) card[i] = i+1;
            int r = sc.nextInt();
            if(n==0 && r==0) break;
            for(int i=0; i<r; i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                int strage[] = new int[c];
                for(int j=0; j<c; j++) strage[j] = card[n-p+1-c+j];
                for(int j=0; j<p-1; j++) card[n-p+1-c+j] = card[n-p+1+j];
                for(int j=0; j<c; j++) card[n-c+j] = strage[j]; 
            }
            System.out.println(card[n-1]);
        }
    }
}
