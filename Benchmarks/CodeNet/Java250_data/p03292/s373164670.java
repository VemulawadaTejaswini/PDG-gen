import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int max = 0;
	int abc[] = {a,b,c};
	Arrays.sort(abc);
	for(int i = 0;i < 2;i++){
		max = max + abc[i] - abc[i+1];
	}
	System.out.println(Math.abs(max));	
	}	
}
	