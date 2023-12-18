import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            if (n==0 && x==0) break;
            int i, j, k;
            int count = 0;
            for (i=1; i<n; i++) {
                for (j=i+1; j<n; j++) {
                    for (k=j+1; k<=n; k++) {
                        if ((i+j+k)==x) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}

