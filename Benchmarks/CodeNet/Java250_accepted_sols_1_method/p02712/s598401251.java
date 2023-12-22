import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long account=0;
        long account2=0;
        
        for(int i=0;i<N;i++){
            account+=1;
            if(account%15==0){
                account2-=account;
            }else if(account%5==0){
                account2-=account;
            }else if(account%3==0){
                account2-=account;
            }
            account2+=account;
        }
        System.out.println(account2);
    }
}