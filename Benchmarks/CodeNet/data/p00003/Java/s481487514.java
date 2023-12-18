
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author AHSAN HABIB
 */
 class Main {

    static String ReadLn(int maxLg) // utility function to read from stdin
    {
        byte lin[] = new byte[maxLg];
        int lg = 0, car = -1;

        try {
            while (lg < maxLg) {
                car = System.in.read();
                if ((car < 0) || (car == '\n')) {
                    break;
                }
                lin[lg++] += car;
            }
        } catch (IOException e) {
            return (null);
        }

        if ((car < 0) && (lg == 0)) {
            return (null);  // eof
        }
        return (new String(lin, 0, lg));
    }

    public static void main(String[] args) {
        Main a = new Main();
        a.begin();
    }

    public void begin() {
        String input;
        StringTokenizer st;
        int a = 0, b = 0, c = 0;
        int lg = 0;
        int maxLg = 255;
        byte[] lin = new byte[maxLg];
        while (lg < maxLg) {
            try {
                int car = System.in.read();
                if ((car < 0) || (car == '\n')) {
                    break;
                }
                lin[lg++] += car;
            } catch (IOException ex) {
            }
        }
        int cases = Integer.parseInt(new String(lin, 0, lg));
        boolean[] flag=new boolean[cases];
        lg=0;
        while (cases >lg) {
            input = Main.ReadLn(255);
            if(input == null){
                break;
            }
            st = new StringTokenizer(input);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if (c * c == a * a + b * b) {
                flag[lg++]=true;
            } else {
                flag[lg++]=false;
            }
        }
        while(--cases>=0){
            if(flag[cases]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}