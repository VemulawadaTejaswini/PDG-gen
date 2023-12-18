import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int g = s.nextInt();
        int b = s.nextInt();

        int k = s.nextInt();

        while(k-- >0){
            if(b<g){
                b=b*2;
            }
            else if(g<r){
                g=g*2;
            }
        }
        if(b>g && g>r){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }



    }
}

