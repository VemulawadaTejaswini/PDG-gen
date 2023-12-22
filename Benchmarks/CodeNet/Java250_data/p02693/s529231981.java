import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = Integer.parseInt(in.nextLine());
        String[] tmp = in.nextLine().trim().split("\\s");
        int a = Integer.parseInt(tmp[0]);
        int b = Integer.parseInt(tmp[1]);
        in.close();
        int res = 0;
        while(res < a){
            res += k;
        }
        if(res <= b){
            System.out.println("OK");
        }
        else{
            System.out.println("NG");
        }
    }
}