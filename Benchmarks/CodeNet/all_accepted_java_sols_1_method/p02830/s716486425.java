import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String result="";
		int a = sc.nextInt();
		String s1 = sc.next();
      	String s2 = sc.next();
      	for(int i=0;i<a;i++)
        {
          result=result+s1.substring(i,i+1)+s2.substring(i,i+1);
        }
      System.out.println(result);
	}
}