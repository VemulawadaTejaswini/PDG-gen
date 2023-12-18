
import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next()), ret = 0;
            
            if((n - 1) / 10000 != 0){
            	ret = (n - 1) / 10000;
            	n = (n - 10000 * ((n - 1) / 10000));
            	ret += n/10000;
            	n %= 10000;
            	ret += n/1000;
            	n %= 1000;
            	ret += n/100;
            	n %= 100;
            	ret += n/10;
            	n %= 10;
            	ret += n;
            }else if((n - 1) / 1000 != 0){
            	ret = (n - 1) / 1000;
            	n = (n - 1000 * ((n - 1) / 1000));
            	ret += n/1000;
            	n %= 1000;
            	ret += n/100;
            	n %= 100;
            	ret += n/10;
            	n %= 10;
            	ret += n;
            }else if((n - 1) / 100 != 0){
            	ret = (n - 1) / 100;
            	n = (n - 100 * ((n - 1) / 100));
            	ret += n/100;
            	n %= 100;
            	ret += n/10;
            	n %= 10;
            	ret += n;
            }else if((n - 1) / 10 != 0){
            	ret = (n - 1) / 10;
            	n = (n - 10 * ((n - 1) / 10));
            	ret += n/10;
            	n %= 10;
            	ret += n;
            }else if((n - 1) / 1 != 0){
            	ret = n;
            }
            
            System.out.println(ret);
            sc.close();
        }
    }
	