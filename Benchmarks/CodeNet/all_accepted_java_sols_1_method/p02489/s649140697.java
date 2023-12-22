import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int a=1 ,x=1;
		while(true){
			a = n.nextInt();
			if(a == 0){
				break;
			}
			System.out.println("Case" + " "  + x +":" + " " + a);
			x++;
		}
	}

}