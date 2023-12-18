import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int x = stdIn.nextInt();

        int[] l =  new int[n];
        for(int i = 0; i < n; i++) {
            l[i] = stdIn.nextInt();
        }

        int[] bound = new int[n + 1];
        bound[0] = 0;
        for(int i = 0; i < n; i++) {
            bound[i + 1] = bound[i] + l[i];
        }

        int count = 0;
        for(int i = 0;i < n + 1; i++) {
            if(bound[i] <= x) {
                count += 1;
            }
        }

        System.out.println(count);


        

    }
}