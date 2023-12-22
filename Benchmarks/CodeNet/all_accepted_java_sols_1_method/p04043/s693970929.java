import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner reader=new Scanner(System.in);
	int A= reader.nextInt();
	int B= reader.nextInt();
	int C= reader.nextInt();
	int tab[]= {A,B,C};
	Arrays.sort(tab);
	if ((tab[0]==5  && tab[1]==5 && tab[2]==7)) {
		System.out.print("YES");}
		else {
			System.out.print("NO");}
	
	}

}
