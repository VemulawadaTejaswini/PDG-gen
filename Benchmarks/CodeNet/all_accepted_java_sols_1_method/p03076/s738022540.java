import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int aa = a % 10;
		int bb = b % 10;
		int cc = c % 10;
		int dd = d % 10;
		int ee = e % 10;
      
      if(aa == 0){
        aa += 10;
      } if(bb == 0){
        bb += 10;
      }if(cc == 0){
        cc += 10;
      } if(dd == 0){
        dd += 10;
      } if(ee == 0){
        ee += 10;
      }
		int min = 10;
		if(min > aa){
		    min = aa;
		}if(min > bb){
		    min = bb;
		}if(min > cc){
		    min = cc;
		}if(min > dd){
		    min = dd;
		}if(min > ee){
		    min = ee;
		}
      int aaa = 0;
      int bbb = 0;
      int ccc = 0;
      int ddd = 0;
      int eee = 0;
      
      	if(a%10 != 0){
		 aaa =(int)Math.ceil(a / 10.0)*10;
        }else{
         aaa = a;
        }
      if(b%10 != 0){
		bbb = (int)Math.ceil(b / 10.0)*10;
        }else{
         bbb = b;
        }
      if(c%10 != 0){
		 ccc = (int)Math.ceil(c / 10.0)*10;
        }else{
         ccc = c;
        }
      if(d%10 != 0){
		 ddd = (int)Math.ceil(d / 10.0)*10;
        }else{
         ddd = d;
        }
      if(e%10 != 0){
		 eee = (int)Math.ceil(e / 10.0)*10;
        }else{
         eee = e;
        }
		int ans = aaa + bbb + ccc + ddd + eee - 10 + min;
		System.out.println(ans);
	}
}
