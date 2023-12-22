import java.util.Scanner;

public class Main {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			
			
			String str=sc.next();
			char[] myChar = str.toCharArray();
			
			int current=0;
			
			
			for(int i=0;i<myChar.length;i++){
				current=myChar[i];
				current=current+n;
				
				if(current>90)current=current-26;
				myChar[i]=(char)current;
			}
			
			System.out.println(myChar);
		}

}
