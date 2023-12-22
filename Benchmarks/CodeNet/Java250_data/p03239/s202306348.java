import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int cst = 0;
        int tmp1=0;
        int tmp2=0;
        for (int i = 0;i<n;i++) {

        	tmp1 = scanner.nextInt();
        	tmp2 = scanner.nextInt();
        	if(tmp2<=t) {
        		if(cst==0) {
        			cst=tmp1;
        		}else {
        			if(tmp1<=cst) {
        				cst=tmp1;
        			}
        		}
        	}
        }
        if(cst!=0) {
        	System.out.println(cst);
        }else {
        	System.out.println("TLE");
        }

    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";
        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String next() {
            try {
                if (i < s.length) return s[i++];
                String line = br.readLine();
                while (line.equals("")) {line = br.readLine();}
                s = line.split(reg, 0);
                i = 0;return s[i++];
            } catch (Exception e) {e.printStackTrace();}
            return null;
        }
        public int nextInt() {
            try {return Integer.parseInt(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public double nextDouble() {
            try {return Double.parseDouble(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public long nextLong()  {
            try {return Long.parseLong(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
    }
}