import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int max1 = a * c;
        int max2 = b * d;
        int max3 = b * c;
        int max4 = a * d;

        if(max1 > max2 && max1 > max3 && max1 > max4) System.out.println(max1);
        else if(max2 > max1 && max2 > max3 && max2 > max4) System.out.println(max2);
        else if(max3 > max1 && max3 > max2 && max3 > max4) System.out.println(max3);
        else System.out.println(max4);



    }
}