import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n==0 && r==0) break;
        int[] card = new int[n];
        int[] card2 = new int[n];
        for(int i=0;i<n;i++){
            card[i]=i+1;
        }
        for(int j=0;j<r;j++){
            int p = sc.nextInt();
            int c = sc.nextInt();

            for(int i=0;i<n-(p+c-1);i++){
                card2[i]=card[i];
            }
            for(int i=n-(p+c)+1;i<n-c;i++){
                card2[i]=card[c+i];
            }
            for(int i=n-c;i<n;i++){
                card2[i]=card[-p+1+i];
            }

            for(int i=0;i<n;i++){
                card[i]=card2[i];
            }
        }
        System.out.println(card2[n-1]);
        }
        sc.close();
    }
}
