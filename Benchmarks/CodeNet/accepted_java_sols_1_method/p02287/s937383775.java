
import java.util.*;


public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int grab = input.nextInt();
        int [] arr = new int[grab+ 1];
        
        for(int i = 1; i <= grab ; i++){
            arr[i] = input.nextInt();
        }//for
        
        for(int i = 1; i <= grab; i++){
            System.out.print("node " + i + ": key = " + arr[i] + ", ");
            if(i/2 > 0){
                 System.out.print("parent key = " + arr[i/2] + ", ");
            }//if
            if(2*i <= grab){
            	System.out.print("left key = " + arr[2*i] + ", ");
            }//if
            if((2*i + 1) <= grab){
                System.out.print("right key = " + arr[2*i + 1] + ", ");
            }
            
            
            System.out.println();
        }//for
    }//main
}
