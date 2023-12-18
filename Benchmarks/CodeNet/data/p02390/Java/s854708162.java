import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int S,h,m,s;
        Scanner sc=new Scanner(System.in);
        S=sc.nextInt();
        h=S/3600;
        S-=(h*3600);
        m=S/60;
        S-=(m*60);
        s=S;
        System.out.println(h+":"+m+":"+s);
    }
}
