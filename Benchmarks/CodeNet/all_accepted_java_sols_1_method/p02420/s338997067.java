import java.util.MissingResourceException;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        try{
            while(true){
                String line = sc.next();
                if(line.equals("-")) {
                    break;
                }
                int m = sc.nextInt();
                for(int i=0;i<m;i++){
                    int h =sc.nextInt();
                    line = line.substring(h)+line.substring(0, h);
                }
                System.out.println(line);
            }
        }catch(MissingResourceException e){
            System.out.println(e);
        }
        sc.close();
    }
}
