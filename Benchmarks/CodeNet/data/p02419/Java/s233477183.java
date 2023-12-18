import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String target=scan.next();
		String s;
		int ans=0;
		while(true){
			s=scan.next();
			if(s.equals("END_OF_TEXT")){
				break;
			}
			else{
				if(s.length()-target.length()==1){
					if(s.substring(0,target.length()-1).equals(target.substring(0,target.length()-1))&&s.charAt(s.length()-1)=='.'){
						ans++;
					}
				}else if(s.equals(target)){
					ans++;
				}
			}
		}
		System.out.println(ans);
		scan.close();
	}
}