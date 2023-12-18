import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        while (sc.hasNextLine()) {
                                double a = sc.nextDouble(),
                                           b = sc.nextDouble(),
                                           c = sc.nextDouble(),
                                           d = sc.nextDouble(),
                                           e = sc.nextDouble(),
                                           f = sc.nextDouble(),
                                           x = a, y = c, z = a, q = b;
                                a*=e; c*=e;
                                d*=b; f*=b;
                                b*=e; e =b;
                                a-=d; c-=f;
                                x = c*1./a;
                                double ansx = c*1./a, ansy = ((y-a*x)*1./q );
                                ansx*=1000;
                                ansx+=0.5;
                                ansx=(long)ansx;
                                ansx/=1000;
                                ansy*=1000;
                                ansy+=0.5;
                                ansy=(long)ansy;
                                ansy/=1000;
                                System.out.println(ansx + " " + ansy);
                        }
                }
        }
}