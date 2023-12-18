import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int time = Integer.parseInt(str);

        int h = time / 3600;
        int m = ((time % 3600) / 60);
        int s = time % 60;

        System.out.println(h + ":" + m + ":" + s);
    }
}