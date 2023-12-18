import java.util.*;


public class Main {
    static boolean[] list;
    static int numr = 0;
    static int numw = 0;
    static int num = 0;
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        num = Integer.parseInt(line);
        line = sc.nextLine();
        list = new boolean[num]; //R=false,W=true

        for (int i = 0; i < num; i++){
            if (line.charAt(i) == 'R') {
                list[i] = false;
                numr++;
            } else {
                list[i] = true;
                numw++;
            }
        }

        if (numr == 0 || numw == 0) {
            System.out.println("0");
            return ;
        }
        
        int count = 0;
        while (!check()) {
            int w = leftWhite();
            int r = rightRed();
            
//            System.out.printf("r:%d,w:%d\n", r, w);
            list[r] = true;
            list[w] = false;
            count++;
 //           printrw();
 //           System.out.println("");
        }
        
        System.out.println(count);
    }

    public static int leftWhite(){
        for (int i = 0; i < num; i++) {
            if (list[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int rightRed(){
        for (int i = num - 1; i >= 0; i--) {
            if (!list[i]) {
                return i;
            }
        }
        return -1;
    }

    public static boolean check() {
        for (int i = 0; i < numw; i++) {
            if (!list[num - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printrw(){
        for (int i = 0; i < num; i++) {
            if (list[i]) {
                System.out.print("W");
            } else {
                System.out.print("R");
            }
        }
    }
}