import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for(int i = 0;i<5;i++){
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        Arrays.sort(array);

        if((array[4]-array[0])<=k){
            System.out.println("Yay!");
        }else{
            System.out.println(":(");
        }
    }

}
