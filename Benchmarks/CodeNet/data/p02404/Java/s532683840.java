import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == 1 && b == 1){
            System.out.println("#");
       }else if(a == 2 && b == 2){
            System.out.println("##\n##");
       }else if(a != 0 && b != 0){
        	StringBuilder buff = new StringBuilder();
        	for(int i= 0; i < b; i++){
            	buff.append("#");
            }
            buff.append("\n");
            
            for(int i= 0; i < a-2; i++){
            	buff.append("#");
            	for(int j = 0; j<b-2; j++){
            		buff.append(".");
            	}
            	buff.append("#\n");
            }
            
            for(int i= 0; i < b; i++){
            	buff.append("#");
            }
            buff.append("\n");
            System.out.println(buff);
        }
    }
}