import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] antenna = new int[5];
        boolean can = true;
        for(int i = 0; i < 5; i++){
            antenna[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i = 0; i < 4; i++){
            for(int j = i+1; j < 5; j++){
                int distance = antenna[j]-antenna[i];
                if(distance > k){
                    can = false;
                    break;
                }
            }
        }
        if(can){
            System.out.println("Yay!");
        } else{
            System.out.println(":(");
        }
    }
}