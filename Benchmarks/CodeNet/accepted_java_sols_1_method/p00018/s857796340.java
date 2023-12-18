import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0;i<5;i++){
            array[i]=(-1)*sc.nextInt();
        }
        Arrays.sort(array);
        for(int i=0;i<5;i++){
            System.out.print((-1)*array[i]);
            if(i<4){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}