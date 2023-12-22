import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if(str.equals("-")){
                break;
            }
            int m = sc.nextInt();
            for(int i = 0; i < m; i++){
                int h = sc.nextInt();
                String con = str.substring(0,h);
                con = str.concat(con);
                str = con.substring(h);
            }
            System.out.println(str);
        }
    }
}