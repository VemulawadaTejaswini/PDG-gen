import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y= sc.nextLong();
        long a = X;
        int count = 0;
        while(a<=Y){
            count++;
            a = a*2;
        }
        System.out.println(count);


    }


}
