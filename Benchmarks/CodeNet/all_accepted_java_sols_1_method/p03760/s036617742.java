
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String first = cin.nextLine();
        String second = cin.nextLine();

        for(int i =1;i<=first.length()+second.length();i++){
        	if(i%2==1){
        		System.out.print(String.valueOf(first.charAt((i-1)/2)));
        	}
        	else{
        		System.out.print(String.valueOf(second.charAt((i/2)-1)));
        	}
        }
    }
}
