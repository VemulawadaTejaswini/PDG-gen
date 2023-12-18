import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double e = 1e-8;
        while(true){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int s = sc.nextInt();
            if(x+y+s<e)break;
            int ans=0;
            for (int i = 1; i < s; i++) {
                for (int j = 1; j < s; j++) {
                    int a = (int)(i*(100+x)/100+e);
                    int b = (int)(j*(100+x)/100+e);
                    if(a+b!=s)continue;
                    
                    a = (int)(i*(100+y)/100+e);
                    b = (int)(j*(100+y)/100+e);
//                    System.out.println(i+" "+j+" "+(a+b));
                    ans=Math.max(ans, a+b);
                }
            }
            System.out.println(ans);
        }
    }

}