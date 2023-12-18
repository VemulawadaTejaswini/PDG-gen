import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        while(!("0 0".equals(str))){
            String[] input = str.split(" ");
            int h = new Integer(input[0]);
            int w = new Integer(input[1]);
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if((i+j)%2==0) sb.append("#");
                    else sb.append(".");
                }
                sb.append("\n");
            }
            str = sc.nextLine();
            System.out.println(sb);
        }
    }
}
