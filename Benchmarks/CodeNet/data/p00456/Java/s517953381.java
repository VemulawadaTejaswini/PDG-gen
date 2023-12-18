import java.util.*;
import java.util.regex.*;
public class Main {

        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            int [] w =new int [10];
            int [] k =new int [10];
            for(int i=0;i<10;i++)w[i]=scan.nextInt();
            for(int i=0;i<10;i++)k[i]=scan.nextInt();
            Arrays.sort(w);
            Arrays.sort(k);
            System.out.println((w[9]+w[8]+w[7])+" "+(k[9]+k[8]+k[7]));
        }
}