import java.util.*;
public class Main {
	public static void main(String[] args){
		int dist = Integer.parseInt(args[0]);
        int speed = Integer.parseInt(args[2]);
        int time = Integer.parseInt(args[1]);
        if(dist/speed < time){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}