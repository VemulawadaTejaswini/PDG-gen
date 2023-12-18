import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int x = Integer.parseInt(br.readLine());
            int i = 0;
            while (i < x) {
                String str = br.readLine();
                String[] num = str.split(" ", 0);
                ArrayList<Integer> al = new ArrayList<>();
                for (int j = 0; j < 3; j++) {
                    al.add(Integer.parseInt(num[j]));
                }
                Collections.sort(al);
                int a = al.get(0);
                int b = al.get(1);
                int c = al.get(2);
                if(c*c==a*a+b*b){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                i++;
            }
        } catch (IOException ex) {
            System.out.println("error");
        }
    }
}