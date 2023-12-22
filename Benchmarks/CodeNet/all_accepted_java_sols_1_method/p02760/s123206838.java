import java.util.*;
public class Main {
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
            // System.out.println(sc.nextInt());
        }
         int [] re = new int[9];
         int num = sc.nextInt();//N個
        for (int i=0; i < num; i++){
            int hikaku = sc.nextInt();
            for(int n=0 ; n < array.length; n++){
                if(array[n] == hikaku){
                    if(re[n] == 0 ){
                        re[n] = 1;
                    }
                } else {
                    if(re[n] != 1){
                        re[n] =0 ;
                    }
                }
            }
        }
        
        if(re[0] == 1 && re[1] ==1 && re[2] ==1){
            System.out.println("Yes");
        } else if(re[3]==1 &&re[4] ==1&& re[5] ==1 ){
            System.out.println("Yes");
        } else if(re[6]==1 &&re[7] ==1&& re[8] ==1 ){
            System.out.println("Yes");
        } else if(re[0]==1 &&re[3] ==1&& re[6] ==1 ){
            System.out.println("Yes");
        } else if(re[1]==1 &&re[4] ==1&& re[7] ==1 ){
            System.out.println("Yes");
        } else if(re[2]==1 &&re[5] ==1&& re[8] ==1 ){
            System.out.println("Yes");
        } else if(re[0]==1 &&re[4] ==1&& re[8] ==1 ){
            System.out.println("Yes");
        } else if(re[2]==1 &&re[4] ==1&& re[6] ==1 ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}