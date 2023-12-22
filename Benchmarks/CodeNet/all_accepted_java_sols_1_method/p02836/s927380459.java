import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
      	int count=0;
      	StringBuffer sb = new StringBuffer();
        for (int i = 0;i <a.length() ; i++)
        {          
          if (i< a.length()/2)
          {
          	sb.append(a.charAt(i));
          }
          else
          {
            sb.append(a.charAt(a.length()-i-1));
          }
        }
      	String b=sb.toString();
      	for (int j = 0;j <a.length() ; j++)
        {
          if(a.charAt(j)!=b.charAt(j))
          {
            count+=1;
          }
        }
      System.out.println(count);
    }
}