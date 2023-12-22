import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int h,m;
        m=s/60;
        h=m/60;
        m-=h*60;
        s-=(h*60*60+m*60);
        System.out.println(h + ":" +m+":"+s);
    }
}
