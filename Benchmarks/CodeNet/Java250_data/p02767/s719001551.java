import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    static Scanner sc;
    public static void main(final String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sc = new Scanner(System.in);
        int numberOfPeople;
		try {
			numberOfPeople = Integer.parseInt(br.readLine());
		
        Long numberOfCoordinates[] = new Long[numberOfPeople];
        
        String string[] = br.readLine().split(" ");
        for (int i = 0; i < numberOfPeople; i++){
            numberOfCoordinates[i] = Long.parseLong(string[i]);
        }

        long output = Long.MAX_VALUE;

        for(int i = 0; i <= 100; i++){
            long cost = 0;
            for (int j = 0; j < numberOfPeople; j++){
                cost += Math.pow(numberOfCoordinates[j]-i,2);
            }
            output = Math.min(output,cost);
        }

        System.out.println(output);

    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }

    public static int findBaseK(int n, final int k) {
        if(n==0) return 1;

        int i = 0;
        while(n!=0){
            n = Math.floorDiv(n, k);
            i++;
        }


        return i;
    }

    public static int parseInt(){
        return Integer.parseInt(sc.next());
    }
}