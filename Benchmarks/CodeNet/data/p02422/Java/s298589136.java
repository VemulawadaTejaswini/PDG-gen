import java.util.Scanner;

class Main{
	public static void main(String[] arg){
	
		
		Scanner sc = new Scanner(System.in);

		String str=sc.next();
		int m=sc.nextInt();
		int a,b;
		
		for(int i=0;i<m;i++){
			
			String go=sc.next();
			a=sc.nextInt();
		        b=sc.nextInt();

			if(go.equals("reverse")){
				
				
				String o =str.substring(0,a);
				String s=str.substring(a, b+1);
				String n= str.substring(b+1);
				String q="";
				
				for(int y=s.length()-1;y>=0;y--){
					q+=s.charAt(y);
				}
				
			str=o+q+n;
			}
			else if(go.equals("replace")){
				//a=sc.nextInt();
				//b=sc.nextInt();
				String str2=sc.next();
				str=str.substring(0,a)+str2+str.substring(b+1,str.length());
				
			}else if(go.equals("print")){
				//a=sc.nextInt();
				//b=sc.nextInt();
				String str2=str.substring(a,b+1);
			    System.out.println(str2);
			}
			
		}
		
		
		
		
		
		}
}
