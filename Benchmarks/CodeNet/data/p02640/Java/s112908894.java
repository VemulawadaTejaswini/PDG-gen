import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int num = 0;

        int[] array = new int[x];
        for(int i = 0; i < x; i++){
            array[i] = 2;
        }
        for(int i = 0; i <= x; i++){
            for(int j = 0; j < x; j++){
                num += array[j];
            }
            if(y == num){
                System.out.print("Yes");
                System.exit(0);
            }
            try{
                array[i] = 4;
            }catch(Exception e){
                
            }
            
            num = 0;
        }
        System.out.print("No");  
    }
}
