import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           TreeSet<String> ts=new TreeSet<String>();
           for(int i=0;i<n;i++){
            String s=sc.next();
            String x=sc.next();
            if(s.equals("insert"))ts.add(x);
            else {
                if(ts.contains(x))System.out.println("yes");
                else System.out.println("no");
            }
           }   
}
}

