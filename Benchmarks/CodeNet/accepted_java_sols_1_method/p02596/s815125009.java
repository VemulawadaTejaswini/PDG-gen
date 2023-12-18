import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
    int K= sc.nextInt();
    int L=0;
    int ans=-1;
    if(K%7==0){
        L=9*K/7;
    }else{
        L=9*K;
    }

    int R=1;
    for(int i=1; i<L; i++){
        R =(R*10)%L;
        if(R==1){
            ans =i;
            break;
        }
      }
    System.out.println(ans);
    }
}
