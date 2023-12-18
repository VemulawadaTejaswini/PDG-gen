import java.util.*;
class Main{
    public static void main(String[] str){
	Scanner in= new Scanner(System.in);
	int s=in.nextInt(),m=s/60,h=m/60;
	s=s%60; m=m%60;
	System.out.printf("%d:%d:%d\n",h,m,s);
    }
}

