import java.util.*;
public class Main{
	public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int n = 1;
      int i ;
	 for(i = 0;n<b;i++){
	 	n+=a-1;
	 }
	 System.out.println(i);
    }
}