import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long a=20190430;
		String[] fruit = s.split("/", 0);
		String ans="";
		for(int i = 0; i<3; i++){
			ans+=fruit[i];
		}
		if(a<Long.parseLong(ans)){
			System.out.println("TBD");
		}else{
			System.out.println("Heisei");
		}
	}
}