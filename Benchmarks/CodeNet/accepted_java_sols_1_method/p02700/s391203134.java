import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int thp = sc.nextInt();
		int tat = sc.nextInt();
		int ahp = sc.nextInt();
		int aat = sc.nextInt();
		boolean flag = true;
		while(thp > 0 && ahp > 0) {
			if(flag){
				flag = false;
				ahp -= tat;
			} else {
				flag = true;
				thp -= aat;
			}
		}
		if(thp > 0){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}
}
