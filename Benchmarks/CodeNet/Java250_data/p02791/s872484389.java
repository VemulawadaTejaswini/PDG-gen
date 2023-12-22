import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in_num = Integer.parseInt(sc.next());
        int[] l = new int[in_num];
        for(int i = 0;i < in_num ; i++){
            l[i] = Integer.parseInt(sc.next());
        }
        int count = 0;
        int mi = Integer.MAX_VALUE;
        for(int i = 0;i < in_num ; i++){
            if(l[i] <= mi){
                count++;
                mi = l[i];
            }
        }
        System.out.println(count);
    }
}