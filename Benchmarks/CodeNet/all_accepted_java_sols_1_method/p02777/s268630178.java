import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //ArrayList<Integer> list;
        String name1 = sc.next();
        String name2 = sc.next();
        int ball1 = sc.nextInt();
        int ball2 = sc.nextInt();
        String unstocked_ball = sc.next();

        if(name1.equals(unstocked_ball)){
            ball1 = ball1 -1;
        }else{
            ball2 = ball2 -1;
        }

        System.out.println(ball1 + " " + ball2);



    
	}
}