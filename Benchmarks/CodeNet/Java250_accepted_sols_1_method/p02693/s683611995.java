import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        int temp=K;
        while(B>=temp){
            if(A<=temp){
                System.out.println("OK");
                System.exit(0);
            }else{
                temp+=K;
            }
        }
        System.out.println("NG");
    }
}