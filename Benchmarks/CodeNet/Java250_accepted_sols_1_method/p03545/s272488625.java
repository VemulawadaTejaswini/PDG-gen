import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int a = Integer.parseInt(s.substring(0,1));
      int b = Integer.parseInt(s.substring(1,2));
      int c = Integer.parseInt(s.substring(2,3));
      int d = Integer.parseInt(s.substring(3,4));
      int x1 = a+b+c+d;
      int x2 = a-b+c+d;
      int x3 = a+b-c+d;
      int x4 = a+b+c-d;
      int x5 = a-b-c+d;
      int x6 = a-b+c-d;
      int x7 = a+b-c-d;
      int x8 = a-b-c-d;
      String aa = String.valueOf(a);
      String bb = String.valueOf(b);
      String cc  =String.valueOf(c);
      String dd = String.valueOf(d);
      if(x1==7) System.out.println(aa+"+"+bb+"+"+cc+"+"+dd+"=7");
      else if (x2==7) System.out.println(aa+"-"+bb+"+"+cc+"+"+dd+"=7");
      else if (x3==7) System.out.println(aa+"+"+bb+"-"+cc+"+"+dd+"=7");
      else if (x4==7) System.out.println(aa+"+"+bb+"+"+cc+"-"+dd+"=7");
      else if (x5==7) System.out.println(aa+"-"+bb+"-"+cc+"+"+dd+"=7");
      else if (x6==7) System.out.println(aa+"-"+bb+"+"+cc+"-"+dd+"=7");
      else if (x7==7) System.out.println(aa+"+"+bb+"-"+cc+"-"+dd+"=7");
      else if (x8==7) System.out.println(aa+"-"+bb+"-"+cc+"-"+dd+"=7");
    }
}