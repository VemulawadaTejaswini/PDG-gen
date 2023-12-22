import java.util.*;
public class Main{
    public static void main (String args[]){

        //初期処理
        Scanner sc=new Scanner(System.in);
        int answer=0;
        int N= sc.nextInt();
        int A= sc.nextInt();
        int B= sc.nextInt();
        
        int trainFee=N*A;
        int taxiFee=B;
        if(trainFee>=taxiFee){
            answer=taxiFee;
        }
        if(trainFee<taxiFee){
            answer=trainFee;
        }
        System.out.println(answer);
    }
}