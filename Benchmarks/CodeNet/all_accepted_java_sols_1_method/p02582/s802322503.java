import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 0;

        switch(str){
            case "RRR":
                result = 3;
                break;
            case "RRS":
                result = 2;
                break;
            case "SRR":
                result = 2;
                break;
            case "SSS":
                result = 0;
                break;
            default:
                result = 1;
                break;
        }
        System.out.println(result);
    }
}