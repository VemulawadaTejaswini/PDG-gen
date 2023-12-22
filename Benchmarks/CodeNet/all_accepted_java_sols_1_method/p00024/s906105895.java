import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        double v = sc.nextDouble();
                        int n = 1;
                        while(Math.pow(2*9.8*5*(n-1),0.5) < v){
                                n++;
                        }
                        System.out.println(n);
                }
                sc.close();
        }
}