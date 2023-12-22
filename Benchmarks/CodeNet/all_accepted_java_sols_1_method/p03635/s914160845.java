import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int z,x,c;
        z=input.nextInt();
        x=input.nextInt();
        c=((z*x)+(z+x)+1)-(((z+1)*2)+((x-1)*2));
        System.out.println(c);
    }
    
}
