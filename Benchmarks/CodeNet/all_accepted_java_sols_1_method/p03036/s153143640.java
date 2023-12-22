import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
     	int katamuki = scan.nextInt();
      	int seppenn = scan.nextInt();
      	int shokichi = scan.nextInt();
      	int atai = shokichi;
      	for(int i = 0; i < 10; i++){
        	System.out.println(katamuki*atai - seppenn);
          	atai = katamuki*atai - seppenn;
        }
    }

}