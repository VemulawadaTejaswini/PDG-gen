import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int a,b,c;
        int[] t = new int[w];
        for(int i=0;i<w;i++){
            t[i]=i+1;
        }
        for(int i=0;i<n;i++){
            String s = sc.next();
            String[] suuti = s.split(",");
            a = Integer.parseInt(suuti[0])-1;
            b = Integer.parseInt(suuti[1])-1;
            c = t[a];
            t[a] = t[b];
            t[b] = c;
        }
        for(int i=0;i<w;i++){
            System.out.println(t[i]);
        }
    }
}
