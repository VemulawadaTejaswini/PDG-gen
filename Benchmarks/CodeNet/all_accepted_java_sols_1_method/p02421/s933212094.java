import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),t = 0,h = 0;
        for(int i = 0;i < n;++i){
            String a = sc.next(),b = sc.next();
            int c = a.compareTo(b);
            if(c > 0) t += 3;
            else if(c < 0) h += 3;
            else{
                ++t;
                ++h;
            }
        }
        System.out.printf("%d %d\n",t,h);
    }

}