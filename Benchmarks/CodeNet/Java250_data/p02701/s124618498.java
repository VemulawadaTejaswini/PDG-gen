import java.util.*;
class Main{
 static public void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Set<String> set=new HashSet<String>();
	
	int num=sc.nextInt();
	for(int i=0;i<=num;i++){
		String str=sc.nextLine();
		set.add(str);
	}
	System.out.println(set.size()-1);
 }
}