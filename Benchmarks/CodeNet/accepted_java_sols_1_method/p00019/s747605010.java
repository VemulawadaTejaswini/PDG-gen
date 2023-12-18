import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        long f=1;
        for(int i=1;i<=a;i++)f=f*i;
        System.out.println(f);
    }
}