import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextInt();
        double y1=sc.nextInt();
        double x2=sc.nextInt();
        double y2=sc.nextInt();
        double dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println(dis);
    }
}

