import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            double KaiX,KaiY;
            
            int Xkeisu, Ykeisu, TeisuX, TeisuY;
            Xkeisu = a*e - d*b;
            TeisuX = c*e - f*b;
            KaiX = (double)TeisuX / Xkeisu;
            Ykeisu = b*d - e*a;
            TeisuY = c*d - a*f;
            KaiY = (double)TeisuY / Ykeisu;
            if(TeisuX==0)KaiX=0;
            if(TeisuY==0)KaiY=0;
            System.out.printf("%.3f %.3f\n", KaiX, KaiY);
        }
    }
}