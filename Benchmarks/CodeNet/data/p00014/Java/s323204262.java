import java.util.Scanner;

public class Main{
        public static void main(String[] args){
                Scanner s = new Scanner(System.in);
                int d;
                while(true){
                        d=s.nextInt();
                        if(d != null) integral(d[i]);
                        else System.exit(-1);
                }
        }

        public static void integral(int d){
                int surface = 0;
                for(int i = 0;i < 600;i += d){
                        surface += i*i*d;
                }

                System.out.println(surface);
        }
}