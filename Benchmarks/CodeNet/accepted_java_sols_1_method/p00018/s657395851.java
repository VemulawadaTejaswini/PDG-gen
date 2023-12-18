import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer array[] = new Integer[5];
        for(int i = 0; i < 5; i++){
            array[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(array,Collections.reverseOrder());
        for(int i = 0; i < 5; i++){
            if(i != 0){
                System.out.print(" ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
