import java.util.*;
class main{
	Scanner sc=new Scanner(System.in);
	void main(){
		String ans="Yes";
		int W=sc.nextInt();
		int H=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int r=sc.nextInt();
		if(x+r>W)ans="No";
		if(x-r<0)ans="No";
		if(y+r>H)ans="No";
		if(y-r<0)ans="No";
		System.out.println(ans);
	}
	public static void main(String[]arg){
		new main().main();
	}
}