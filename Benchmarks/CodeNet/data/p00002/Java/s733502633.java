import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		Integer[] keta = new Integer[200];
		
		while(sc.hasNext()){
			keta[i] = sc.nextInt();
			i++;							//i???(????????°+1)
		}
		i = i-1;	//i???????????°???
		while(i >= 0){
			System.out.println(String.valueOf(keta[i]+keta[i-1]).length());
			i = i-2;
		}
		sc.close();
	}
}