import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String x=scn.next();
       System.out.println(Integer.parseInt(String.valueOf(x.charAt(0)))+Integer.parseInt(String.valueOf(x.charAt(1)))+Integer.parseInt(String.valueOf(x.charAt(2))));
    }
}