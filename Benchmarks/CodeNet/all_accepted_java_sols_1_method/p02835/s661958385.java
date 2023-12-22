import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      	int a1=sc.nextInt();
      	int a2=sc.nextInt();
      	int a3=sc.nextInt();
      	String o;
      	if(a1+a2+a3>=22)o="bust";
      	else o="win";
     	 System.out.println(o);
    }
}