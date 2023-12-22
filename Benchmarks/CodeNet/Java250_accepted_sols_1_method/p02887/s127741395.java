    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int n = scan.nextInt();
			String str=scan.next();
			char t = ' ';
			int count=0;
			for(int i=0;i<n;i++)
			{
				char a = str.charAt(i);
				if(a!=t){
					count++;
				}
				t=a;
			}
			System.out.println(count);
    	}
    }