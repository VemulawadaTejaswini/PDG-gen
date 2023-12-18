import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a==b&&a!=c)System.out.println("Open");
	else System.out.println("Close")
    }
    public static void main(String[]ag){
	new Main().main();
    }
}