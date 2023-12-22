import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();

	boolean isAB5C7 = (a==5 && b==5 && c==7);
	boolean isBC5A7 = (a==7 && b==5 && c==5);
	boolean isCA5B7 = (a==5 && b==7 && c==5);

	if(isCA5B7||isBC5A7||isAB5C7){
		System.out.println("YES");
	}else{
		System.out.println("NO");
	}
	}
}