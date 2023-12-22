import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s3 = sc.next();
        String[] split = s3.split("");
        int rain=0;
        int a=0;
        for(int i=0; i<3; i++) {
            if(split[i].equals("R")) {
                rain += 1;
            }else if(split[i].equals("S")){
                if(rain == 2||rain == 1) {
                    break;
                }else {
                    rain = 0;
                }
            }
        }
        System.out.println(rain);
    }
}