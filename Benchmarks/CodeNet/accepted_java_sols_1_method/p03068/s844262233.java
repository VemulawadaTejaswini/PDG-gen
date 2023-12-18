import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        int k = sc.nextInt();
        String key = s.substring(k - 1, k);



        int i;
        for(i = 0; i < s.length(); i++){
            String tmp = s.substring(i, i + 1);
            if(tmp.equals(key)){

            }else{
                sb.setCharAt(i, '*');
            }


        }
        System.out.println(sb.toString());


    }
}
