import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> train = new ArrayList<Integer>();
		try{
			while(true){
				int i = scn.nextInt();
				if(i == 0){
					System.out.println(train.get(train.size()-1));
					train.remove(train.size()-1);
				}else{
					train.add(i);
				}
			}
		}catch(Exception e){
			}
		}
}