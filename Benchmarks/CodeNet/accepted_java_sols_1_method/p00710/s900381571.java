import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, r, p, c;
        int[] card = new int[50];
        int[] tmp = new int[50];
        while(true){
            n = sc.nextInt();
            r = sc.nextInt();
            if(n == 0 && r == 0) break;
            for(int i=0;i<n;i++){
                card[i] = n-i;
            }
            for(int i=0;i<r;i++){
                p = sc.nextInt();
                c = sc.nextInt();
                for(int j=0;j<c;j++){
                    tmp[j] = card[p-1+j];
                }
                for(int j=0;j<p-1;j++){
                    card[p-2-j+c] = card[p-2-j];
                }
                for(int j=0;j<c;j++){
                    card[j] = tmp[j];
                }
            }
            System.out.println(card[0]);
        }
    }
}
