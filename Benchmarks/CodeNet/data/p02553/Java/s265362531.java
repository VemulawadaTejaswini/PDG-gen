import java.util.*;

public class Main{
	
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      
      int tmp1 = a*c;
      int tmp2 = a*d;
      int tmp3 = b*c;
      int tmp4 = b*d;
      
      // tmp1のチェック
      if(((tmp1>tmp2)|| (tmp1==tmp2)) &&((tmp1>tmp3) || (tmp1==tmp3)) && ((tmp1>tmp4) || (tmp1==tmp4))){
            System.out.println(tmp1);
      // tmp2のチェック
      }else if (((tmp2>tmp1) || (tmp2==tmp1)) && ((tmp2>tmp3) || (tmp2==tmp3)) && ((tmp2>tmp4) || (tmp2==tmp4))){        
            System.out.println(tmp2);
      // tmp3のチェック  
      }else if (((tmp3>tmp1) || (tmp3==tmp1)) && ((tmp3>tmp2) || (tmp3==tmp2)) && ((tmp3>tmp4) || (tmp3==tmp4))){
            System.out.println(tmp3);
      }else if (((tmp4>tmp1) || (tmp4==tmp1)) && ((tmp4>tmp2) || (tmp4==tmp2)) && ((tmp4>tmp3) || (tmp4==tmp3))){
            System.out.println(tmp4);
      }
    }
}