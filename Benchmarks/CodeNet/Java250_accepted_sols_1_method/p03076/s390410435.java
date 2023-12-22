import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int[] array = {Integer.parseInt(sc.nextLine()),
                        Integer.parseInt(sc.nextLine()),
                        Integer.parseInt(sc.nextLine()),
                        Integer.parseInt(sc.nextLine()),
                        Integer.parseInt(sc.nextLine())};
        
        int result = 0;
        int p = 0;
        int q = 0;
        int tmp = 0;
        
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i; j < array.length; j++){
                p = array[i] % 10;
                if(p == 0){
                    p = 10;
                }
                q = array[j] % 10;
                if(q == 0){
                    q = 10;
                }
                
                if(p < q){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        
        
        for(int i = 0; i < array.length; i++){
            if(i > 0 && array[i - 1] % 10 != 0){
                result += 10 - (array[i - 1] % 10);
            }
            result += array[i];
        }
        
        System.out.println(result);
        
    }
}
