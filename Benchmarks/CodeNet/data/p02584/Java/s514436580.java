import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		long x = sc.nextLong();
      	long k = sc.nextLong();
      	long d = sc.nextLong();
      	long nokorikaisuu = 0;
      	long kekka = x;

        for(int i = 0 ; i <k ; i++){
        	if(Math.abs(kekka-d) <= Math.abs(kekka+d)){
            	kekka = kekka - d;
            }else{
            	kekka = kekka + d;
            }
          
          if(x>=0){
          	//プラス
			if(kekka<=0){
            	nokorikaisuu = k - (i+1);
            	if(nokorikaisuu % 2 != 0){
                	kekka = kekka + d;
                }
              break;
            }
          }else{
            //マイナス
          	if(kekka>=0){
            	nokorikaisuu = k - (i+1);
            	if(nokorikaisuu % 2 != 0){
                	kekka = kekka - d;
                }
              break;
            }
          }
        
        }

			System.out.println(Math.abs(kekka));
		
	}
}