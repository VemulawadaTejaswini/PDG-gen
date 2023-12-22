import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int c=1;
	while(true){
	int a = sc.nextInt();
	if(a!=0) System.out.println("Case "+c+": "+a);
	else break;
	c = c + 1;
	}
}
}