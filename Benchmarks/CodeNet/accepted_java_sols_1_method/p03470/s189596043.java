
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final int size=100;
        boolean[] sizes=new boolean[size];
        for(int i=0;i<size;i++){
            sizes[i]=false;
        }
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int size2=scanner.nextInt();
            sizes[size2-1]=true;
        }
        int result=0;
        for(int i=0;i<size;i++){
            result=sizes[i]?result+1:result;
        }
        System.out.println(result);

    }
}
