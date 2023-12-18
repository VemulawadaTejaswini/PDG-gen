import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int count=0;
			boolean flag=true;
			String str[]=new String[n];
			int c[]=new int[n];
			for(int i=0; i<n; i++){
				str[i]=sc.next();
				c[i]=sc.nextInt();
			}
			
			for(int i=0; i<n; i++){
				
				if(str[i].equals("(")){
					count+=c[i];
				}
				else if(str[i].equals(")")){
					if(count==0){
						flag=false;
						break;
					}
					count-=c[i];
					if(count < 0){
						flag=false;
						break;
					}
				}
			}
			if(flag && count==0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}

	}

}