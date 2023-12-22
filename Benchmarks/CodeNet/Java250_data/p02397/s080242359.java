import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	while(true){
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    if(x==0&&y==0)break;
	    if(x<y)System.out.println(x+" "+y);
	    else System.out.println(y+" "+x);
	}
    }
    public static void main(String[]ag){
	new Main().main();
    }
}