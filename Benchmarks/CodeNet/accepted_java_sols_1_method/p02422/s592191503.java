import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		int count = scan.nextInt();
		
		for(int i = 0;i < count;i++)
		{
			String cmd = scan.next();
			int a = scan.nextInt();
			int b = scan.nextInt() + 1;
			
			if(cmd.equals("print")){
				System.out.println(sb.substring(a,b));
			}else if(cmd.equals("reverse")){
				StringBuffer tmpsb = new StringBuffer(sb.substring(a,b)).reverse();
				String tmp = tmpsb.toString();
				sb = sb.replace(a,b,tmp);
			}else if(cmd.equals("replace")){
				String p = scan.next();
				sb = sb.replace(a,b,p);
			}
		}
	}
}