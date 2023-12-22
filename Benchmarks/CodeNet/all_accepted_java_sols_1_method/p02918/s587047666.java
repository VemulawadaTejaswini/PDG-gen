import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        HashMap<Integer, Integer> mem = new HashMap<>();
        LinkedList<Integer> dic = new LinkedList<>();
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        char p = s.charAt(0);
        int c=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==p){
                c++;
            }
            else {
                dic.add(c);
                c=1;
                p=s.charAt(i);
            }

        }
        dic.add(c);
//        System.out.println(dic);
        int count =0;
        int sum =0;
        while (k>0 && dic.size()>0){
            sum+=dic.removeFirst();
            count++;
            if (count==3){
                k--;
                count=1;
            }
        }
        int ans=0;
        ans+= sum-1;
        while (dic.size()>0){
            ans+=dic.removeFirst()-1;
        }
        System.out.println(ans);
    }
}
