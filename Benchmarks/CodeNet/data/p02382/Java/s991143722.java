import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n; i++)x[i] = scanner.nextInt();
        for(int i = 0; i < n; i++)y[i] = scanner.nextInt();


        double d_inf = 0, d1=0, d2=0, d3=0;
        double sub;

        for(int i = 0; i < n; i++){
            sub = Math.abs(x[i]-y[i]);
            d2 += sub*sub;
            d3 += sub*sub*sub;
            if(sub > d_inf)d_inf = sub;
            d1 += sub;
        }
        d2 = Math.sqrt(d2);
        d3 = Math.cbrt(d3);

        System.out.println(d1+"\n"+d2+"\n"+d3+"\n"+d_inf);

    }
}

