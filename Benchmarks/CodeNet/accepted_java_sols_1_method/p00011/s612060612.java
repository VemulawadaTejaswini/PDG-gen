import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] stick;
        int w = sc.nextInt();
        int n = sc.nextInt();

        stick = new int[w];
        for(int i=0;i<w;i++){
            stick[i] = i+1;
        }

        for(int i=0;i<n;i++){
            String str = sc.next();
            String[] ab = str.split(",");
            int a = Integer.parseInt(ab[0])-1;
            int b = Integer.parseInt(ab[1])-1;

            int x = stick[a];
            stick[a] = stick[b];
            stick[b] = x;
        }

        for(int i=0;i<w;i++){
            System.out.println(stick[i]);
        }
    }
}

