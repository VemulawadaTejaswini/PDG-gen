import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int h,m,s;
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        h = S/3600;
        m = (S%3600)/60;
        s = S%60;
        System.out.println(h+":"+m+":"+s);
        }
}
