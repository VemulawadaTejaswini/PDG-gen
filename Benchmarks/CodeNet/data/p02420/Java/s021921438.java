
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        while(true){
            String s = scan.next();
            if(s.equals("-"))break;
            StringBuilder sb = new StringBuilder(s);
            int h = scan.nextInt();
            for(int i = 0;i < h;i++){
                int hn = scan.nextInt();
                String s1 = sb.substring(0, hn);
                sb.delete(0, hn);
                sb.append(s1);
            }
            System.out.println(sb);

        }


        scan.close();
    }

    

}
