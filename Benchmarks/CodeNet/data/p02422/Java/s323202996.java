import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        int cnt = 1;
        List<Character> str = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            str.add(s.charAt(i));
        }
        while(cnt <= q){
            String order = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            char k =0;
            char l = 0;
            int a2 = 0;
            int b2 = 0;
            if(order.equals("print")){
                for(int i = 0; i <= b - a; i++){
                    System.out.print(str.get(i + a));
                }
                System.out.println("");
            }else if(order.equals("reverse")){
                 a2 = a;
                    b2 = b;
                for(int i = 0; i < (b - a)/2; i++){
                   k = str.get(a2);
                   l = str.get(b2);
                           str.set(a2, l);
                           str.set(b2, k);
                           a2++;
                           b2--;
                }
            }else{
            String p = sc.next();
            a2 = a;
            for(int i = 0; i <= b - a; i++){
                str.set(a2, p.charAt(i));
                a2++;
            }
        }
            cnt++;
        }
    }}