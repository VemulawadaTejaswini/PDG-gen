import java.util.*;

class Main{
    public static void main(String[] args){
        int  x,y,z,c;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        c = 0;
        while( x <= y ){
            if( z%x == 0){
                c = c + 1;
            }
            x = x + 1;
        }
        System.out.println(c);
    }
}
 