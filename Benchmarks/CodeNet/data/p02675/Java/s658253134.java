import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        N %=10;
        if(N==3) System.out.println("bon");
        if((N==0)||(N==1)||(N==6)||(N==8)) System.out.println("pon");
        else System.out.println("hon");
    }
}