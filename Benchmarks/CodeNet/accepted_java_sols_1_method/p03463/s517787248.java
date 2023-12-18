import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        //System.out.print(b-a-1);
        if((b-a-1) % 2 == 0){
          System.out.print("Borys");
        }else{
          System.out.print("Alice");
        }
	}
}