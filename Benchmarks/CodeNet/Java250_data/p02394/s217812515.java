import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int W=sc.nextInt(),H=sc.nextInt();
        int x=sc.nextInt(),y=sc.nextInt();
        int r=sc.nextInt();
        if((x-r>=0)&&(y-r>=0)&&(x+r<=W)&&(r+y<=H))System.out.println("Yes");
        else System.out.println("No");
    }
}