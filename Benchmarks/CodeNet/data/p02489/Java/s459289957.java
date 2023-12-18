import java.util.Scanner;
import java.util.ArrayList;


public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> c = new ArrayList<Integer>();
	int a;
	a = 0;
	for(int i=1; ;i++){
		int x = sc.nextInt();
		if(x != 0){
			c.add(x);
		}else{
		break;
		}
		}
	for (a = 0;a < c.size();a++){
		System.out.println("Case "+(a+1)+": " + c.get(a));
		}
	}
	}

		