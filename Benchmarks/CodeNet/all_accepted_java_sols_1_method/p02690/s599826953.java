import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        for(long A=0;A<1000;A++){
            for(long B=-1000;B<1000;B++){
                if(A*A*A*A*A - B*B*B*B*B == X){
                    System.out.println(A + " " + B);
                    return;
                }
            }
        }
    }

}
