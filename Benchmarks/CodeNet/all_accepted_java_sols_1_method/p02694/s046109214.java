import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long yokin = sc.nextLong();
        long yokin2 = 100l;
        int year = 0;
        while(true){
            yokin2 += yokin2*0.01;
            year += 1;
            if(yokin <= yokin2){
                break;
            }
        }
        System.out.println(year);
    }
}
