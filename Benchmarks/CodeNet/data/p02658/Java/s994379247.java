import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int n = sc.nextInt();
      long kai=1;
      for(int i=0;i<n;i++){
        long kk=sc.nextLong();
        if(kk==0){
          kai=0;
          break;
        }else{
          kai*=kk;
          if(kai>1000000000000000000l){
            kai=-1;
             for(int k=i;k<n;k++){
               long ik=sc.nextLong();
               if(ik==0l){
         	  kai=0;
         	  break;
        	 }
             }
            break;
          }
        }
      }
      System.out.println(kai);
    }
}