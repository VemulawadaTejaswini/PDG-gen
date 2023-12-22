import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        if(Integer.parseInt(str[0]) <= Integer.parseInt(str[1])){
            System.out.print("unsafe");
        }else{
            System.out.print("safe");
        }
    }
}
