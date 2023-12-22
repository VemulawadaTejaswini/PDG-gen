import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = 0;
            int y = 0;
            int cnt = 0;
            boolean end = false;
            
            while(!end){
            	String temp = br.readLine();
            	String[] numbers = temp.split(" ");
            	x = Integer.parseInt(numbers[0]);
            	y = Integer.parseInt(numbers[1]);
            	
            	if((x < 0 && y > 10000) || (x == 0 && y == 0) || cnt > 3000){
            		end = true;
            	}else if(x > y || x == y){
            		System.out.println(y + " " + x);
            	}else if(x < y){
            		System.out.println(x + " " + y);
            	}
            	cnt++;
            }
            

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}