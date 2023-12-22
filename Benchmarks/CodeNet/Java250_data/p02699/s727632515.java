import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
		String[] str = scan.nextLine().split(" ");
		int[] x = new int[str.length];
		
        for(int i = 0; i < str.length; i++){
            x[i] = Integer.parseInt(str[i]);
        }
        
        if(x[0] > x[1]){
            System.out.println("safe");
        }else{
            System.out.println("unsafe");
        }
        
    }
}