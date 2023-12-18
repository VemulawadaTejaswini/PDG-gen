import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n;
        int cnt=0;
        long d,x,y;
        n=inp.nextInt();
        d=inp.nextLong();
        d=d*d;
        for(int i=0;i<n;i++){
            x=inp.nextLong();
            y=inp.nextLong();
            if(x*x+y*y<=d) cnt++;
        }
        System.out.println(cnt);
    }
}
