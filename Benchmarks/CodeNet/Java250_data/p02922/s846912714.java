import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(B==1){
            System.out.println(0);
        }
        else{
            for(int i=1; i<B; i++){
                if((A-1)*(i-1)+A>=B){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}