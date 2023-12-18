import java.util.Scanner;

public  class test12{
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	String n = stdIn.next();
	int ans = 0;
	for(int i=0;i<n.length();i++){
		ans+= n.charAt(i)-'0';
	}
if(ans%9==0){
System.out.println("Yes");
}
else {
System.out.println("No");
}

}
}