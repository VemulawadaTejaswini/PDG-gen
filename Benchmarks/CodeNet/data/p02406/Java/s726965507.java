import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
	    if(i%3==0||i%10==3)System.out.print(" "+i);
	}
	System.out.println();
    }
    public static void main(String[]ag){
	new Main().main();
    }
}