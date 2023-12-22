import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
        String W,T;
        int count=0;
        W= sc.next();
        while(sc.hasNext()){
        T=sc.next();
        if(T.equalsIgnoreCase(W))count++;
        }
        System.out.println(count);
    }
}

