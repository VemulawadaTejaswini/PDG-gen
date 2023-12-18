import java.util.*;

public class Main{
    public static void main(String[] args){
        int x, y, i=0, max=3000;
        Scanner s = new Scanner(System.in);
        do{
            x = s.nextInt();
            y = s.nextInt();
            if ((x==0) && (y==0)) break;
            if (x<=y) System.out.println(x+" "+y);
            else System.out.println(y+" "+x);
            i++;
        }while(i<max);
    }
}
