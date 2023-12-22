import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int leng = scan.nextInt();
        scan.close();
        double result = 0.0;

        double amari = leng % 3;
        double qubeAmari = amari / 3;

        double qubeLength = leng - amari;
        qubeLength = qubeLength / 3;

        if(leng >= 3){result = (qubeLength + qubeAmari) * (qubeLength + qubeAmari) * (qubeLength + qubeAmari);}
        else {result = qubeAmari * qubeAmari * qubeAmari;}

        System.out.println(String.format("%.12f", result));
    }
}