import java.io.*;
import java.util.*;

    public class Main extends PrintWriter {
        Main() { super(System.out, true); }
        Scanner sc = new Scanner(System.in);
        public static void main(String[] $) {
            Main o = new Main(); o.main(); o.flush();
        }

        void main(){
            char C = sc.next().charAt(0);

            if(C == 'z'){
                print('z');
            }
            else{
                int u;
                u = (int) C;
                u = u+1;
                C = (char) u;
                print(C);
            }



    }
}
