import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while(sc.hasNext()) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if (m==-1&&f==-1&&r==-1) break;
            String ret;
            if (m==-1||f==-1) {
                ret = "F";
            } else if (m+f>=80) {
                ret = "A";
            } else if (m+f>=65) {
                ret = "B";
            } else if (m+f>=50) {
                ret = "C";
            } else if (m+f>=30) {
                if (r>=50) {
                    ret = "C";
                } else {
                    ret = "D";
                }
            } else {
                ret = "F";
            }
            
            System.out.println(ret);
        }
    }
}