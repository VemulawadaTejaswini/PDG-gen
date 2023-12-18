import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] aH = new int[10];
        int temp;
        for(int i = 0; i<10; i++){
            aH[i] = s.nextInt();
        }
        
        for(int i = 1; i<10; i++){
            for(int j = i; j>0; j--){
                if(aH[j-1] <aH[j] ){
                    temp = aH[j-1];
                    aH[j-1] = aH[j];
                    aH[j] = temp;
                } else{
                    break;
                }
            }
        }
        
        for(int i = 0; i<3; i++){
            System.out.println(aH[i]);
        }
    }
}