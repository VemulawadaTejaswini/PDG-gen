import java.io.DataInputStream;

/**
 * Created by TmhrMrs on 2016/04/13.
 */
class Main {
    public static void main(String[] args)throws java.io.IOException{
        DataInputStream d = new DataInputStream(System.in);
        String str = d.readLine();
        int a = Integer.parseInt(str);
        System.out.println(a*a*a);
    }
}