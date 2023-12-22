import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        HashSet<Long> list = new HashSet<Long>();

        for(int i = 0; i < N; i++) {
            list.add(scanner.nextLong());
        }
        
        if(N == list.size()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
	}
}