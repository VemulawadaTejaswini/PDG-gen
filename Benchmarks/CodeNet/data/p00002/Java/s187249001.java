import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int height[] = new int[10];
        
        while(stdIn.hasNext()){
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            
            int sum = a + b;
            
            for(int i = 1; ; i++){
            	if(sum < 10){
					System.out.println(i);
                    break;
                }
                sum /= 10;
            }
        }

        stdIn.close();
    }
}
