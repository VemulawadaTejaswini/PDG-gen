import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0) break;
            
            Rect rect = new Rect(H, W);
            Vector<Rect> v = new Vector<Rect>();
            
            for (int w = 2; w <= 150; w++) {
                for (int h = w-1; h > 0; h--) {
                    Rect r = new Rect(h, w);
                    if (rect.compareTo(r) < 0) {
                        v.add(r);
                    }
                }
            }
            
            Collections.sort(v);
            
            rect = v.get(0);
            System.out.println(rect.h + " " + rect.w);
        }
    }
    
    public static class Rect implements Comparable<Rect> {
       int w;
       int h;
       
       public Rect(int h, int w) {
           this.h = h;
           this.w = w;
       }
       
       public int compareTo(Rect r) {
           int diag1 = w * w + h * h;
           int diag2 = r.w * r.w + r.h * r.h;
           if (diag1 == diag2) {
               return h - r.h;
           }
           return diag1 - diag2;
       }
    }
}


