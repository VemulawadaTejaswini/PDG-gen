import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count =0;
        int multiple=0;
        boolean flag = true;
        while(flag){
            count++;
            multiple=K*count;
            if(A<=multiple&& multiple<=B){
                System.out.println("OK");
                break;
            }
            if(multiple>=1000) {
                flag=false;
                System.out.println("NG");
                break;
            }
        }
        ;
    }
}