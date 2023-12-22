import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] stick = new int[w];
        for(int i = 0; i < w; i++){
            stick[i] = i + 1;
        }
        for(int i = 0; i < n; i++){
            String input = sc.next();
            String[] aSt = input.split(",",0);
            int[] a = new int[2];
            a[0] = Integer.parseInt(aSt[0]);
            a[1] = Integer.parseInt(aSt[1]);
            int sw = stick[a[0] - 1];
            stick[a[0] - 1] = stick[a[1] - 1];
            stick[a[1] - 1] = sw;
        }
        for(int i = 0; i < w; i++){
            System.out.println(stick[i]);
        }
        sc.close();
    }
}
