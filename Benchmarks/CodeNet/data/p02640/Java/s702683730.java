import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int rem=Y%4;
        if(X==1 && (Y==2||Y==4))System.out.println("Yes");
        if(Y>X*4)
        System.out.println("No");
        
        else if(rem==0||rem==2)System.out.println("Yes");
        else
        System.out.println("No");
    }
}