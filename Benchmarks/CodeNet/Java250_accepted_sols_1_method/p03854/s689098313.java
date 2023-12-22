import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
 
        int sLen = s.length();
        boolean flag = true;
        String []w = {"dreameraser", "dreamerase", "dreamer", "eraser",
                "dream", "erase"};
        int begin = 0;
        int end = 0;
        while(flag) {
            if(begin == sLen) {
                if(sLen == 0) {
                    System.out.println("NO");
                    break;
                }else {
                    System.out.println("YES");
                    flag = false;
                    break;
                }
            }else {
                for(int i = 0; i < 7; i++) {
                    if(i == 6) {
                        System.out.println("NO");
                        System.exit(0);
                    }
                    end = begin + w[i].length();
                    //System.out.println("end " + end);
                    if(end <= sLen) {
                        String sub = s.substring(begin, end);
                        //System.out.println(sub);
                        if(sub.equals(w[i])) {
                            begin = end;
                            //System.out.println(i + " " + begin);
                            break;
                        }
                    }
                }
            }
 
        }
 
    }
}