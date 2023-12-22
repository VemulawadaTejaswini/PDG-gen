import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String c=scan.next();
        int w=0;
        for(int i=0;i<N;i++){
            String h=c.substring(i,i+1);
            if (h.equals("W")){w++;}
            }
        int p=0;
        c=c+"B";
        for(int i=1;i<=w;i++){String j=c.substring(N-i,N+1-i);
            if(j.equals("R")){p++;}
        }
        System.out.println(p);
    }
}
