import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long H;
        H = sc.nextLong();
        long W;
        W = sc.nextLong();
        if((H==1)||(W==1)){
            System.out.print(1);
        }else if((W*H)%2==0){
            System.out.print(H*W/2);
        }else{
            System.out.print(H*W/2+1);
        }  
    }

    
}