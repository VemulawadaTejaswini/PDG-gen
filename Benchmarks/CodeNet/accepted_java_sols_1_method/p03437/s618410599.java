import java.util.Scanner;

public class Main {

 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long X = scanner.nextLong();
            long Y = scanner.nextLong();
            double Lim = Math.pow(10, 18);
            boolean find=false;
            if ((X%Y)!=0){
                for (long z=X; z <=Lim; z=z+X){
                    if ((z % Y) != 0){
                        System.out.println(z);
                        find=true;
                        break;
                    }
                }
            }
            if (!find) System.out.println(-1);
        }
}