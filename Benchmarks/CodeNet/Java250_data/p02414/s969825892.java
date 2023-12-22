import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_7_D
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    private final static String SPACE = " ";
    
    public static void main(String[] args) {
        try {
            LineNumberReader stdReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            int n = 0;
            int m = 0;
            int l = 0;
            long[][] a = null;
            long[][] b = null;
            while ((sStr = stdReader.readLine()) != null) {
                
                // ????????????????????????
                if (stdReader.getLineNumber() == 1) {
                    String[] inputs = sStr.split(" ");
                    n = Integer.valueOf(inputs[0]);
                    m = Integer.valueOf(inputs[1]);
                    l = Integer.valueOf(inputs[2]);
                    // ??????????´???¨??????
                    a = new long[n][m];
                    b = new long[m][l];
                } else if (stdReader.getLineNumber() <= 1 + n) {
                    // 2????????\??????????????????
                    // ??????????????°(0,1,2,...)
                    int i = stdReader.getLineNumber() - 2;
                    String[] inputs = sStr.split(SPACE);
                    for (int j=0; j<m; j++) {
                        a[i][j] = Long.parseLong(inputs[j]);
                    }

                } else if (stdReader.getLineNumber() <= 1 + n + m) {
                    int k = stdReader.getLineNumber() - (2 + n);
                    String[] inputs = sStr.split(SPACE);
                    for (int j=0; j<l; j++) {
                        b[k][j] = Long.parseLong(inputs[j]);
                    }
                    if (stdReader.getLineNumber() == 1 + n + m)
                        break;
                }
            }
            
            double c[][] = new double[n][l];
            
            // ?????? x ???????????????
            double temp = 0;
            for (int k = 0; k < l; k++) {
                for (int i = 0; i < n; i++) {
                    temp = 0;
                    for (int j = 0; j < m; j++) {
                        temp += a[i][j] * b[j][k];
                    }
                    c[i][k] = temp;
                }
            }
            
            // ??¢???????????????
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < l; k++) {
                    System.out.print(String.format("%.0f",  c[i][k]));
//                    System.out.print( c[i][k]);
                    if (k < l - 1)
                        System.out.print(SPACE);
                }
                System.out.println();
            }
            
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
}