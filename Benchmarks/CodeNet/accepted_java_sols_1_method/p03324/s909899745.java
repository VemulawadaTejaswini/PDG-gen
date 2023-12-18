
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int D=scanner.nextInt();
        final int N=scanner.nextInt();
        int count=0;
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(i%Math.pow(100,D)==0&&i%Math.pow(100,D+1)!=0){
                count++;
            }
            if(count==N){
                System.out.println(i);
                return;
            }
        }
    }
}