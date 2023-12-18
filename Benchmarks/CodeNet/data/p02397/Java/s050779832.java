import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();
        int a = 0;
        int b = 0;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a < b){
                inputList.add(a);
                inputList.add(b);
            }else{
                inputList.add(b);
                inputList.add(a);
            }
            
        }while(a != 0 || b != 0);
        
        int count = 0;
        for(int input: inputList){
            if(++count % 2 == 0){
            	count = 0;
            	System.out.println(input);
            }else{
            	System.out.print(input + " ");
            }
        }
        
    }
}
