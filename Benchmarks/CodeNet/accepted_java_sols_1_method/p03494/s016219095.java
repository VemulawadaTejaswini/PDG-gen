import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int[] A = new int[x];
        
        for(int i = 0; i < x; i++){
            A[i] = sc.nextInt();
        }
        
        int count = -1;
        boolean state = true;
        while(state){
            count++;
            //偶数であれば2で割って格納し、奇数であればbreak。
            for(int j = 0; j < x; j++){
                if(A[j] % 2 == 0){
                    A[j] /= 2;
                }else{
                    state = false;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
