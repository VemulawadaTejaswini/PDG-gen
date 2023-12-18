import java.util.*;
public class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int c = sc.nextInt();
	int a = Math.max(x,y);
	int b = Math.min(x,y);
	int z =0;
		for(int i = a; i<b+1; i++){
			if(c % i  == 0){
			z++;
			}
		}
	}
}
