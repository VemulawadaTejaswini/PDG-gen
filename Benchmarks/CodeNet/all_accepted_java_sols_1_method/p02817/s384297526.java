    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.IOException;
    import java.io.InputStreamReader; 
    import java.io.OutputStreamWriter;
    import java.io.PrintWriter;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
            StringTokenizer st;
            String a=sc.readLine();
            st=new StringTokenizer (a);
            String a1=st.nextToken();
            String a2=st.nextToken();
            pw.println(a2+a1);
            pw.close();
        }
    }//:D