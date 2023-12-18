import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            double v=s.nextDouble();
            System.out.println((int)Math.ceil((v*v/(9.8*2)+5)/5));
        }
    }
}
//by Tuvshee 12.05.2012
//Physical Experiments