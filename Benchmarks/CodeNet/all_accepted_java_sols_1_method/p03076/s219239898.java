import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int dish = 0;
    	int dish_min = 0;
    	int dish_nokori= 0;
    	int sum = 0;

    	for(int i=0; i< 5; i++){
    		dish = sc.nextInt();
    		sum += dish;
    		dish_nokori = 0;

    		if(dish / 100 != 0){
    			dish = dish % 100;
    		}

    		if(dish / 10 != 0){
    			dish = dish % 10;
    		}

    		if (dish != 0){
    			dish_nokori = 10 - dish;
    		}


    		if(i == 0 && dish != 0){
    			dish_min = dish;
    		} else if (dish < dish_min && dish != 0){
    			dish_min = dish;
    		}

    		sum += dish_nokori;

    	}

		if (dish_min != 0){
			dish_nokori = 10 - dish_min;
	    	sum -= dish_nokori;
		}

    	// 出力
    	System.out.println(sum);
    }
}