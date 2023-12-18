import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if(num >= 400 && num <=599){
            System.out.println(8);
        }
        if(num >= 600 && num <=799){
            System.out.println(7);
        }
        if(num >= 800 && num <=999){
            System.out.println(6);
        }
        if(num >= 1000 && num <=1199){
            System.out.println(5);
        }
        if(num >= 1200 && num <=1399){
            System.out.println(4);
        }
        if(num >= 1400 && num <=1599){
            System.out.println(3);
        }
        if(num >= 1600 && num <=1799){
            System.out.println(2);
        }
        if(num >= 1800 && num <=1999){
            System.out.println(1);
        }        
    }
}