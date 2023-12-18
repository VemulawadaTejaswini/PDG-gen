import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=sc.nextDouble();
        double pro=a*b;
        if(pro>=0) {
            System.out.println((int)Math.floor(pro));
        }else{
            System.out.println((int) Math.ceil(pro));
        }
    }

}
