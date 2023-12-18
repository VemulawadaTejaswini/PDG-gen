import java.util.*;
public class Main {

	public static void main(String[] args) {
		int i1, i2, count = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
			i1 = sc.nextInt();
			i2 = sc.nextInt();
			count++;
			if(i1 == 0 && i2 == 0)
				break;
			else{
				if(i1 < i2)
					System.out.println(i1 +" "+ i2);
				else
					System.out.println(i2 +" "+ i1);
			}
		}
	}

}