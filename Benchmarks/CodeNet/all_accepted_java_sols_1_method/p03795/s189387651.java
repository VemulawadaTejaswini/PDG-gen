import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int z,x,c;
        z=input.nextInt();
        int paid=z*800;
        int back=(z/15);
        int pricaback=back*200;
        int total=paid-pricaback;
        System.out.println(total);
    }
    
}
