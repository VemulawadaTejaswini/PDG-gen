import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;

        for(int i =0;i<16;i++){
            for(int j =0;j<16;j++){
                if((i*4+j*7)==n){
                    cnt++;
                }
            }
        }

        if(cnt!=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
