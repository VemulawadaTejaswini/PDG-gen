import java.lang.reflect.Array;
import java.util.*;
public class Main {




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n_x = Integer.parseInt(scan.next()) + 1;
        int[] xpoint = new int[n_x];

        int m_y = Integer.parseInt(scan.next()) + 1;
        int[] ypoint = new int[m_y];

        xpoint[0] = Integer.parseInt(scan.next());

        ypoint[0] =  Integer.parseInt(scan.next());

        for(int i = 1; i < n_x; i++){
            xpoint[i] =  Integer.parseInt(scan.next());
        }

        for(int i = 1; i < m_y ; i++){
            ypoint[i] =  Integer.parseInt(scan.next());
        }

        Arrays.sort(xpoint);
        Arrays.sort(ypoint);
        
        if(xpoint[n_x -1] < ypoint[0]){

            System.out.println("No War");
        }
        else{

            System.out.println("War");
        }
    }
}
