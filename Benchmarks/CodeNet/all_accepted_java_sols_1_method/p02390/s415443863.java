import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int S=in.nextInt();
        
        int m=S/60; S%=60;
        int h=m/60; m%=60;
        System.out.printf("%d:%d:%d\n",h,m,S);
    }
}
