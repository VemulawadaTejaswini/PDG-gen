import java.util.*;

class Main{	
	public static void main(String[] args){
    
    	Map<String,String> tommorowWeatherMap = new HashMap<String, String>(){
        	{
            	put("Sunny", "Cloudy");
                put("Cloudy", "Rainy");
                put("Rainy", "Sunny");
            }
        };
    	Scanner sc = new Scanner(System.in);
        String todayWeather = sc.next();
        System.out.println(tommorowWeatherMap.get(todayWeather));
    }
}
