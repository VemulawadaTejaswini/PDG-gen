import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int[] array = {Integer.parseInt(sc.nextLine()),
                        Integer.parseInt(sc.nextLine()),
                        Integer.parseInt(sc.nextLine()),
                        Integer.parseInt(sc.nextLine()),
                        Integer.parseInt(sc.nextLine())};
        int k = Integer.parseInt(sc.nextLine());
        
        boolean flag = false;
        
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(Math.abs(array[i] - array[j]) > k){
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        
        if(!flag){
            System.out.println("Yay!");
        }else{
            System.out.println(":(");
        }
        
    }
}
