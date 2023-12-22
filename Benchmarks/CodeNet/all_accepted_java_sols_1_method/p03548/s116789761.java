import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x,y,z,num,num2;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        num = x/(y+z);
        if(num*(y+z)+z <=x) System.out.println(num);
        else System.out.println(num-1);
    }
}
