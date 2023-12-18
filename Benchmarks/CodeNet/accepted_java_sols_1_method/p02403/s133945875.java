
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            if(h == 0 && w == 0){
                break;
            }
            for(int i =0;i<w;i++){
                sb.append("#");
            }
            for(int j=0;j<h;j++){
                System.out.println(sb.toString());
            }
            System.out.println();
        }
    }
}

