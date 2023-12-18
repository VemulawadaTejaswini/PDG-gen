import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int z,x,c;
        z=input.nextInt();
        x=input.nextInt();
        c=input.nextInt();
        String s=(String.valueOf(z)+String.valueOf(x)+String.valueOf(c));
        int y=Integer.parseInt(s);
        if(y%4==0)
            System.out.println("YES");
        else System.out.println("NO");
    }
    
}
