import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder buff = new StringBuilder();
        
        for(int i= 0; i < b; b++){
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
        
        for(int i= 0; i < b; b++){
        	buff.append("#");
        }
        buff.append("\n");
        System.out.println(buff);
       
    }
}