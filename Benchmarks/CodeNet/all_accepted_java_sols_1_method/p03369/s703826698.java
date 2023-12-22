import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
      
      	int v = 700;
      	for(int i = 0; i < S.length(); i++){
        if(S.charAt(i) == 'o'){
        	v += 100;
        }
      }
      
      System.out.println(v);
    }
}
