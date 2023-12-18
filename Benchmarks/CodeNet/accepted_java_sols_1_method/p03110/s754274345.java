import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        double ans = 0;
        for (int i=0;i < N;i++){
            String s = br.readLine();
            String[] t = s.split(" ");
            if (t[1].equals("JPY")){
                ans = ans+Integer.parseInt(t[0]);
            } else {
                ans = ans+Double.parseDouble(t[0])*380000.0;
            }
        }
        System.out.println(ans);
    }
}