import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double max = Math.max(x,y)*2;

        double prev = Double.MAX_VALUE;
        for(int i = 0; i <= max; i+=2){
            //if(x < 0 || y < 0){break;}
            double cur = a * x + b * y + c * i;
            //System.out.println("x : " + x + " y : " + y + " i : " + i + " total : " + cur);
            if(x > 0){x--;}
            if(y > 0){y--;}
            if(prev <= cur){break;}
            else{prev = cur;}
        }
        System.out.println((int)prev);
    }
}

