
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String K = scan.next();
    int p=0;
    int y[]=new int[3];
if(K.substring(0,1).equals("R")){y[0]=1;}

        if(K.substring(1,2).equals("R")){y[1]=1;}

        if(K.substring(2,3).equals("R")){y[2]=1;}

        if(y[0]==1||y[1]==1||y[2]==1){p=1;};
        if((y[0]==1&&y[1]==1)||(y[1]==1&&y[2]==1)){p=2;}
        if(y[0]==1&&y[1]==1&&y[2]==1){p=3;}

        System.out.println(p);
    }

}
