import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		String k=String.valueOf(n);
		String kk[]=k.split("");
		boolean ans=true;
		if(kk[0].equals(kk[2])){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}



  }
}
