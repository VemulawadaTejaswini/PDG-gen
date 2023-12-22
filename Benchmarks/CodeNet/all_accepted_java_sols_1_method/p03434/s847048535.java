import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner  sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Alice=0;
        int Bob=0;
        Integer list[] =new Integer[N];
        for (int i =0;i<N;i++){
            list[i]=sc.nextInt();
        }
        Arrays.sort(list,Comparator.reverseOrder());
        for (int i=0;i<N;i++){
            if (i%2 ==0){
                Bob +=list[i];
            }else{
                Alice +=list[i];
            }
        }
        System.out.println(Math.abs(Alice-Bob));
    }
}