import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int taro = 0;
    	int hanako = 0;
    	int num = input.nextInt();
    	for(int i = 0 ; i < num ; i++){
    		String s_taro = input.next();
    		String s_hanako = input.next();
    		if(s_taro.compareTo(s_hanako) > 0){
    			taro += 3;
    		}else if(s_taro.compareTo(s_hanako) < 0){
    			hanako += 3;
    		}else{
    			taro += 1;
    			hanako += 1;
    		}
    	}
    	System.out.println(taro+" "+hanako);
    }
}