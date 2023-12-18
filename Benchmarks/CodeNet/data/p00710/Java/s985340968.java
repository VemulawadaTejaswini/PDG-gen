import java.util.Scanner;
public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        int[] card1 = new int[50];
        int[] card2 = new int[50;
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n==0&&r==0)
                break;
            for(int i=0;i<n;i++){
                card1[i] = n-i;
            }
            for(int x=0;x<r;x++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                for(int j=0;j<p-1;j++){
                    card2[j] = card1[j];
                }
                for(int k=0;k<c;k++){
                    card1[k] = card1[k+p-1];
                }
                for(int m=c;m<c+p-1;m++){
                    card1[m] = card2[m-c];
                }
            }
            System.out.println(card1[0]);
        }
    }
}
