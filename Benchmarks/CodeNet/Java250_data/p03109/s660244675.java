import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] s = str.split("/", 0);
        if(s[0].compareTo("2019")<0 && s[0].length()<=4) {
            System.out.println("Heisei");
        }else if(s[0].compareTo("2019")==0) {
            if(s[1].compareTo("04")<=0 && s[1].charAt(0)=='0') {
                if(s[2].compareTo("30")> 0 && s[1].compareTo("04")==0) {
                    System.out.println("TBD");
                    return;
                }
                System.out.println("Heisei");
            }else {
                System.out.println("TBD");
            }
        }else {
            System.out.println("TBD");
        }
    }
}