import java.util.*;

public class Main {
    static public void main(String[] args){
       Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            if(s.equals("0")) break;
            int sum = 0;
            for(int i = 0; i<s.length(); i++){
                sum += Integer.parseInt(s.substring(i, i+1));
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
