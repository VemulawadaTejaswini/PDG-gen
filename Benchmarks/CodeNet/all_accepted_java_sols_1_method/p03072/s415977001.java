import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        String[] line = sc.nextLine().split(" ");
        
        int[] array = new int[num];

        for (int i = 0;i < num;i++){
            array[i] = Integer.parseInt(line[i]);
        }

        int ans = 1;
        boolean isCanLook = true;
        for (int i = 1;i < num; i++){
            for (int k = 0;k < i;k++){
                if(array[k] > array[i]){
                    isCanLook = false;
                    break;
                }
            }

            if(isCanLook){
                ans++;
            }

            isCanLook = true;
        }


        System.out.println(ans);
    }
}
