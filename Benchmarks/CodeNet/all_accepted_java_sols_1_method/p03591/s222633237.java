import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String like = sc.next();
		String[] cha = like.split("I",-1);
		
		if(cha[0].equals("YAK")){
			if(like.equals("YAK")){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}else{
			System.out.println("No");
		}
	}
}