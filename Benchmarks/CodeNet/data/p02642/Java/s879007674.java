import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();

        for(int loop=0; loop<N; loop++) {
            int scan = scanner.nextInt();

            boolean exist = false;
            for(int temp : A) {
                if(temp%scan==0) {
                    A.removeAll( temp );
                    break;
                }else if(scan%temp==0) {
                    exist = true;
                    break;
                }
            }
            if(!exist) {
                A.add(scan);
            }
        }

        int count=0;

        for(int loop : A) {
            for(int innerLoop : A) {
                if( innerLoop == loop ){
                    continue;
                }
                if( loop % innerLoop == 0 ) {
                    count++;
                    break;
                }
            }
        }

        System.out.println( N - count );
    }
}