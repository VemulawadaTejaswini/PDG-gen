import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int w=sc.nextInt();
	int h=sc.nextInt();
	int x=sc.nextInt();
	int y=sc.nextInt();
	int r=sc.nextInt();
	String ans="Yes";
	if(x-r<0||x+r>w||y-r<0||y+r>h)ans="No";
	System.out.println(ans);
    }
    public static void main(String[]ag){
	new Main().main();
    }
}