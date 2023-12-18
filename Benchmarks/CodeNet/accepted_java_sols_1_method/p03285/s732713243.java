import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        if(N>=18){
            System.out.println("Yes");
        }else{
            if(N==17||N==13||N==10||N==9||N==6||N==5||N<=3){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
