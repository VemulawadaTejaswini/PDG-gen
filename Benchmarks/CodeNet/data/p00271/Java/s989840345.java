import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
                
    	int high;
		int low;
    	int sa[] ={0,0,0,0,0,0,0};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<7;i++){
			high = sc.nextInt();
			low = sc.nextInt();
			sa[i] = high - low;
		}
		
		for(int n=0;n<7;n++){
			System.out.println(sa[n]);
		}
    }
}