import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buf=sc.next();
		String pre="";
		int cnt=1;
		for(int i=0;i<buf.length();i++){
			if(buf.substring(i, i+1).equals(pre)){
				cnt++;
				//System.out.println(cnt);
				if(cnt==3){
					System.out.println("Yes");
					return;
				}
			}else{
				cnt=1;
			}
			pre=buf.substring(i,i+1);
			//System.out.println(pre);
		}
		System.out.println("No");
	}

}
