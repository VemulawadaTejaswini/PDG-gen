import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int x = sc.nextInt();
            int h = sc.nextInt();
            if(x==0 && h==0) break;
            double hyou = x*Math.sqrt(4*h*h+x*x) + x*x;
            System.out.println(hyou);
        }
    }
}