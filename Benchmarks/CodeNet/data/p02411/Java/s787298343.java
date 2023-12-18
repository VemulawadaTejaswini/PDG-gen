import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int mi = 0;
        int fi = 0;
        int re = 0;
        do{
            mi = input.nextInt();
            fi = input.nextInt();
            re = input.nextInt();
            judge(mi, fi, re);
        }while(input.hasNext());
    }
    
    public static void judge(int m, int f, int r){
        if((m + f) >= 80 && ((m > 0) && (f > 0)))
            System.out.println("A");
        else if(((m + f) < 80) && ((m + f) >= 65) && ((m > 0) && (f > 0)))
            System.out.println("B");
        else if(((m + f) < 65 && (m + f) >= 50) ||((m + f) < 50 && (m + f) >= 30 && r >= 50) && ((m > 0) && (f > 0)))
            System.out.println("C");
        else if(((m + f) < 50) && ((m + f) >= 30) && (r < 50) && ((m > 0) && (f > 0)))
            System.out.println("D");
        else if(m < 0 && f < 0 && r < 0);
        else if((m < 0) || (f < 0) || (((m + f) < 30) && (r < 50)))
            System.out.println("F");

    }
}
