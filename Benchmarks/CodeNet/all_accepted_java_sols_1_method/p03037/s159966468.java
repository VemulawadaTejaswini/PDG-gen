import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        int card = scanner.nextInt();
        int gate = scanner.nextInt();
        
        int l = 0,r = Integer.MAX_VALUE,tmpr = 0,tmpl = 0;
        for(int i=0;i < gate; i++){
            tmpl = scanner.nextInt();
            tmpr = scanner.nextInt();
            l = (l > tmpl ? l : tmpl);
            r = (r < tmpr ? r : tmpr);
        }
        
        int open  = r-l+1;
        open = open <= 0 ? 0 : open; 
        System.out.println(open);
    }
}
