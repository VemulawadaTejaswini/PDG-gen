import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        int xPymax = 0;
        int xPymin = 2000000100;
        int xMymax = 0;
        int xMymin = 2000000100;
        int mxPymax = 0;
        int mxPymin = 2000000100;
        int mxMymax = 0;
        int mxMymin = 2000000100;
        
        int[] array = new int[8];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (xPymax < x[i]+y[i]) {
                array[0] = i;
                xPymax = x[i]+y[i];
            }
            if (xPymin > x[i]+y[i]) {
                array[1] = i;
                xPymin = x[i]+y[i];
            }
            if (xMymax < x[i]-y[i]) {
                array[2] = i;
                xMymax = x[i]-y[i];
            }
            if (xMymin > x[i]-y[i]) {
                array[3] = i;
                xMymin = x[i]-y[i];
            }
            
            if (mxPymax < -x[i]+y[i]) {
                array[4] = i;
                mxPymax = -x[i]+y[i];
            }
            if (mxPymin > -x[i]+y[i]) {
                array[5] = i;
                mxPymin = -x[i]+y[i];
            }
            if (mxMymax < -x[i]-y[i]) {
                array[6] = i;
                mxMymax = -x[i]-y[i];
            }
            if (mxMymin > -x[i]-y[i]) {
                array[7] = i;
                mxMymin = -x[i]-y[i];
            }
            // xPymax = Math.max(xPymax, x[i]+y[i]);
            // xPymin = Math.min(xPymin, x[i]+y[i]);
            // xMymax = Math.max(xMymax, x[i]-y[i]);
            // xMymin = Math.min(xMymin, x[i]-y[i]);
            // mxPymax = Math.max(mxPymax, -x[i]+y[i]);
            // mxPymin = Math.min(mxPymin, -x[i]+y[i]);
            // mxMymax = Math.max(mxMymax, -x[i]-y[i]);
            // mxMymin = Math.min(mxMymin, -x[i]-y[i]);
        }
        
        long ans1 = Math.abs(x[array[0]] - x[array[1]]) + Math.abs(y[array[0]] - y[array[1]]);
        long ans2 = Math.abs(x[array[2]] - x[array[3]]) + Math.abs(y[array[2]] - y[array[3]]);
        long ans3 = Math.abs(x[array[4]] - x[array[5]]) + Math.abs(y[array[4]] - y[array[5]]);
        long ans4 = Math.abs(x[array[6]] - x[array[7]]) + Math.abs(y[array[6]] - y[array[7]]);
        
        // long ans1 = xPymax - xPymin;
        // long ans2 = xMymax - xMymin;
        // long ans3 = mxPymax - mxPymin;
        // long ans4 = mxMymax - mxMymin;
        
        long ansa = Math.max(ans1, ans2);
        long ansb = Math.max(ans3, ans4);
        
        long ans = Math.max(ansa, ansb);
        System.out.println(ans);
        
        
        // System.out.println(xPymax);
        // System.out.println(xPymin);
        // System.out.println(xMymax);
        // System.out.println(xMymin);
        // System.out.println(mxPymax);
        // System.out.println(mxPymin);
        // System.out.println(mxMymax);
        // System.out.println(mxMymin);
        // (x1, y1), (x2, y2)の距離は max{(x1+y1)-(x2+y2), (x1-y1)+(x2-y2), (-x1+y1)-(-x2+y2), (-x1-y1)-(-x2-y2)} 
    }
}