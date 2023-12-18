import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	int arrayNum = sc.next();
        long lim = 1000000000000000000L;
      	long quo = 1;
      boolean flg = true;
        for(int i = 0; i < arrayNum; i++){
          while(flg){
            long tmp = sc.nextLong();
            if(tmp == 0){
              quo = 0;
              flg = false;
            }else if(tmp <= lim / quo){
            	quo *= tmp;
          	}else{
               quo = -1;
          		flg = false;
          	}
          }
        }	

          

        System.out.println(quo);
      
      }
    }