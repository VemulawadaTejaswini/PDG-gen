import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> res = new ArrayList<String>();     
        while(true) {
            String line = br.readLine();
            String[] line2 = line.split(" ");
            int a1 = Integer.parseInt(line2[0]);
            int a2 = Integer.parseInt(line2[1]);
            int a3 = Integer.parseInt(line2[2]);
            if(a1==-1&&a2==-1&&a3==-1)break;
            if(a1==-1 || a2==-1) {
                res.add("F");
            }
            else if(a1+a2>=80) {
                res.add("A");
            }
            else if(a1+a2>=65) {
                res.add("B");
            }
            else if(a1+a2>=50) {
                res.add("C");
            }
            else if(a1+a2>=30) {
                if(a3>=50)
                    res.add("C");
                else
                    res.add("D");
            }else {
                res.add("F");
            }
        }
        print(res);
    }
    static void print(List<String> list) {
        for(String s:list) {
            System.out.println(s);
        }
    }
}