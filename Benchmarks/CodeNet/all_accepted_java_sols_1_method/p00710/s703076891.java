import java.util.Scanner;

/**
 * Created by macbookpro on 2017/07/13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String inputString = sc.nextLine();
            String[] input= inputString.split(" ");
            int n = Integer.parseInt(input[0]);
            if(n==0){
                break;
            }
            int r=Integer.parseInt(input[1]);
            int[] card=new int[n];

            for(int i=0; i<n; i++){
                card[i]=n-i;
            }

            for(int i=0; i<r; i++) {
                String pcString = sc.nextLine();
                String[] pc = pcString.split(" ");
                int p = Integer.parseInt(pc[0]);
                int c = Integer.parseInt(pc[1]);
                int[] keep = new int[p-1];

                for (int j = 0; j < p - 1; j++) {
                    keep[j] = card[j];
                }

                for (int j = 0; j < c; j++) {
                    card[j] = card[p - 1 + j];
                }
                for(int j=0; j<p-1; j++){
                    card[j+c]=keep[j];
                }

            }
            System.out.println(card[0]);
        }
    }
}