import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cnt = 1; 
        int num =0;
        int max=0;
        
        for(int i =1;i<40;i++){
            for(int j =2;j<40;j++){

                num = (int)Math.pow(i,j);
                if(max<num && num<=x){
                    max=num;
                }
            }
        }
        System.out.println(max);

    }
}




