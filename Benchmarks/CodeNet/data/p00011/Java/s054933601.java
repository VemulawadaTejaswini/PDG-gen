import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(); //棒の本数
        int bar[] = new int[w];
        int n = sc.nextInt(); //交換の回数
        String str;

        for(int i=0; i<w; i++) bar[i] = i+1;

        for(int i=0; i<n; i++){
            int t;
            str = sc.next();
            String[] ab = str.split(",");
            int a = Integer.parseInt(ab[0]) - 1;
            int b = Integer.parseInt(ab[1]) - 1;
            t = bar[a];
            bar[a] = bar[b];
            bar[b] = t;
        }

        for(int i=0; i<w; i++) System.out.println(bar[i]);

        sc.close();
    }
}
