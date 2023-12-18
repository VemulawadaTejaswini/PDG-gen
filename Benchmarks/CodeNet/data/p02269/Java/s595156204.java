import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Set<String> dic=new HashSet<>();
		int n=sc.nextInt();
		String com,word;
		for(int i=0;i<n;i++){
			com=sc.next();
			word=sc.next();
			if(com.equals("insert")){
				dic.add(word);
			}
			else if(dic.contains(word)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}
}
