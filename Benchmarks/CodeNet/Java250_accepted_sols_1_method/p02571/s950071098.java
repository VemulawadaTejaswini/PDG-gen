import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine(),t=sc.nextLine();
		int max=Integer.MAX_VALUE;
		
			 for(int i=0;i<s.length()-t.length()+1;i++)
		        {
		            String x="";
		            		x+=s.substring(i, i+t.length());
		            int c=0;
		            for(int j=0;j<t.length();j++)
		            {
		                if(x.charAt(j)!=t.charAt(j))c++;
		            }
		            max=Math.min(max,c);
		        }
		System.out.println(max);

	}

}
