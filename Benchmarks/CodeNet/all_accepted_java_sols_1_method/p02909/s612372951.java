import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String st = sc.nextLine();
    	final String  Sunny = "Sunny";
    	final String Cloudy = "Cloudy";
    	final String Rainy = "Rainy";
    	String result = "";
    	if(Sunny.equals(st)) {
    		result = Cloudy;
    	}else if(Cloudy.equals(st)) {
    		result = Rainy;
    	}else if(Rainy.equals(st)) {
    		result = Sunny;
    	}

    	https://atcoder.jp/contests/abc141/custom_test
    	
    	System.out.println(result);
    	
    }
}