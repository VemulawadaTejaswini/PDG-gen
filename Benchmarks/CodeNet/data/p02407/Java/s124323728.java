import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array[] = new int[num];
        for(int i=0;i<num;i++){
            array[i] = sc.nextInt();
        }
        for(int i=num;i>0;i--){
            System.out.print(array[i-1]);
            if(i-1>0){
                System.out.print(" ");
            } else {
                System.out.println("");
            }
        }
    }
}

