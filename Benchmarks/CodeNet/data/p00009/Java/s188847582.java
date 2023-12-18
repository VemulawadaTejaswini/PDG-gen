import java.util.Scanner;

public class Main {

    public int kazu(int num){

        int count = 0;
        boolean result;

        for(int i = 2; i < num; i++){
            result = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    result = false;
                    break;
                }
            }
            if(result)count++;
        }
        return count;
    }

    public static void main(String[] args){
    	
    	Scanner sc = new Scanner (System.in);
        Main sosu = new Main();
        int num = sc.nextInt();
        while(num < 100000){
        	System.out.println(sosu.kazu(num));
        	num = sc.nextInt();
        	
        }


    }

} 