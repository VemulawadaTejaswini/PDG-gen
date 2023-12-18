import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r;
        double S,l;
        r=sc.nextInt();
        S=r*r*3.141592;
        l=2*r*3.141592;
        System.out.println(S+" "+l);
    }
}

