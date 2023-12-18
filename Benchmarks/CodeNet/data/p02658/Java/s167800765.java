import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int n = sc.nextInt();
      int kai=1;
      int tencount=0;
      for(int i=0;i<n;i++){
        int kk=sc.nextInt();
        if(kk==0){
          kai=0;
          break;
        }else{
          if(kk>=10){
            tencount++;
            if(tencount>18){
              kai=-1;
              break;
            }
          }
          kai*=kk;
        }
      }
      System.out.println(kai);
    }
}