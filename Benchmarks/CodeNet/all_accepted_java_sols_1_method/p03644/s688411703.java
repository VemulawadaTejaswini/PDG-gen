import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int limit = sc.nextInt();
    int max =0;
    int result=1;
    for(int i=1; i<=limit; i++){
        int tmp =i;
        int cnt=0;
        while(true){
            if(tmp%2!=0){
                break;
            }
            tmp=tmp/2;
            cnt++;
        }
        if(cnt>max){
            max =cnt;
            result=i;
        }
    }
    System.out.println(result);
  }
}