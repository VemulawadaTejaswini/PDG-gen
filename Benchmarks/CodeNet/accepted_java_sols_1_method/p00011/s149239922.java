import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int a=0,b=0;
        int[] num = new int[w];
        for(int i=0;i<w;i++){
            num[i] = i+1;
        }
        for(int i=0;i<n;i++){
            String str = sc.next();
            String[] ab = str.split(",");
            a = Integer.parseInt(ab[0]);
            b = Integer.parseInt(ab[1]);
            int t = num[a-1];
            num[a-1] = num[b-1];
            num[b-1] = t;
        }
        for(int i=0;i<w;i++){
            System.out.println(num[i]);
        }
        sc.close();
    }
}
