import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, n;
        int[] amida;

        w = sc.nextInt();
        n = sc.nextInt();
        amida = new int[w];
        for(int j=0;j<w;j++)
            amida[j]=j+1;
        for(int i=0;i<n;i++){
            String s = sc.next();
            String[] sp = s.split(",");
            int c;
            int a=Integer.parseInt(sp[0]);
            int b=Integer.parseInt(sp[1]);
            c = amida[a-1];
            amida[a-1]=amida[b-1];
            amida[b-1]=c;
        }
        for(int k=0;k<w;k++){
            System.out.println(amida[k]);
        }


    }
}

