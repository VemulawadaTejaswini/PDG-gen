
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n=scanner.nextInt();
        boolean[] booleans=new boolean[10000];
        int[] ints=new int[n];
        boolean flag=true;
        int result=0;
        for(int i=0;i<n;i++){
            ints[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            if(flag){
                flag=false;
                continue;
            }
            if(i==n-1){
                if(ints[n-2]==ints[n-1]){
                    result++;
                }
            }else{
                if(ints[i-1]==ints[i]){
                    result++;
                    flag=true;
                }
            }

        }
        System.out.println(result);
    }
}