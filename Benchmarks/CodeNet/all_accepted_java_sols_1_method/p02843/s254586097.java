import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        
        int num1 =x/100;
        int num2 =x%100;
        int count=0;

        for(int i=0;i<num1;i++){
            if(num2>= 5){
                num2 -= 5;
            }else if(num2 >= 4){
                num2 -= 4;
            }else if(num2 >= 3){
                num2 -= 3;
            }else if(num2 >= 2){
                num2 -= 2;
            }else if(num2 >= 1){
                num2 -= 1;
            }
        }
        if(num2 == 0){
            
            System.out.println("1");
            
        }else{
            System.out.println("0");
        }
    }
}
