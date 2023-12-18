import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if (n == 0 && r == 0)
                break;

            int[] card = new int[n];
            for(int i=0;i<n;i++){
                card[i] = i+1;
            }

            int[] temp = new int[n];

            for(int i=0;i<r;i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                
                for(int j=0;j<c;j++)
                    temp[c-1-j] = card[n-p-j];

                for(int j=n-p+1;j<n;j++)
                    card[j-c] = card[j];

                for(int j=0;j<c;j++)
                    card[n-c+j] = temp[j];
            }
            System.out.println(card[n-1]);
        }
    }
}

