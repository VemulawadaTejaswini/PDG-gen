import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        double d = scn.nextDouble();
        int n = scn.nextInt();
        d = Math.pow(100,d);
        if(n==100) n++;
        if(d==0){
            System.out.println((int)n);
        }else{
            System.out.println((int) d*n);
        }
    }
}