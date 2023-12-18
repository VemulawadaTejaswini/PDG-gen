import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                int n = sc.nextInt();
                int r = sc.nextInt();

                if(n==0){
                    break;
                }
                int[] card = new int[n];
                for(int i=0;i<n;i++){
                    card[i] = n-i;
                }

                for(int i=0;i<r;i++){
                    int p = sc.nextInt();
                    int c = sc.nextInt();

                    int[] shuffleC = new int[c];
                    int[] shuffleP = new int[p];

                    for(int j=0;j<p-1;j++){
                        shuffleP[j] = card[j];
                    }
                    for(int j=0;j<c;j++){
                        shuffleC[j] = card[p-1+j];
                    }

                    for(int j=0;j<c;j++){
                        card[j] = shuffleC[j];
                    }
                    for(int j=0;j<p-1;j++){
                        card[j+c] = shuffleP[j];
                    }

                    shuffleC = null;
                    shuffleP = null;

                }
                
                System.out.println(card[0]);
                
                card =null;
            }
        }  
    }
}
