import java.util.Scanner;


public class Main{

	public static void main(String args[]){
	int i,j,k,q,count=0,no;
	String find;
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	
	
	
String dic[]=new String[n+1];
	
	for(i=0;i<n;i++){
		String s=sc.next();
		char d=s.charAt(0);
		no=0;
		if(d=='i'){
		dic[count]=sc.next();
		
		count++;
		}
		
		else{
			find=sc.next();
			for(j=0;j<count;j++){
				if(find.equals(dic[j])){
					System.out.println("yes");
				break;
				}
				else{
					no++;
					if(no==count-1){
						System.out.println("not");
						break;
					}
				}
			}
		}
	}
	
	
	}
}