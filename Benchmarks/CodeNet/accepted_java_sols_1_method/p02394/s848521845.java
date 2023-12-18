import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w,h,x,y,r;
        w=sc.nextInt();
        h=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        r=sc.nextInt();
        if((x-r)<0||(x+r)>w||(y-r)<0||(y+r)>h)
        	System.out.println("No");
        if((x-r)>=0&&(x+r)<=w&&(y-r)>=0&&(y+r)<=h)
        	System.out.println("Yes");
        sc.close();
        }
}
