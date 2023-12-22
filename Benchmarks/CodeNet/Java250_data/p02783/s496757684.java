import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Random rand = new Random();

		// 整数の入力
        int hp= sc.nextInt();
        int attack = sc.nextInt();

        int count = 0;
        if(hp % attack == 0){
            count = hp / attack;
        }else{
            count = (hp / attack) + 1;
        }
        
        System.out.println(count);



    
	}
}