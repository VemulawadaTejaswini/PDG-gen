import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();int sum=0;
        while(sc.hasNext()){
            if(s.equals(sc.next().toLowerCase()))sum++;
        }
        System.out.println(sum);
    }
}

