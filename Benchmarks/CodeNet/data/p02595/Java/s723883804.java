import java.util.*;
import java.io.*;
public class Main extends PrintWriter {
    Main()
    {
        super(System.out);
    }
    public static void main(String args[]) {
      Main o=new Main();
      o.main();
      o.flush();
      o.close();
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int c=0;
        while(n-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            double sp=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            if(sp<=d)
            c++;
        }
        println(c);
        
    }
}