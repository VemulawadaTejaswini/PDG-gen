import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            int n= scan.nextInt();
            while(n!=0){
            	int x =scan.nextInt();
            	int y =scan.nextInt();
            	int w =scan.nextInt();
            	int h =scan.nextInt();
            	int N = scan.nextInt();
            	int ans = 0;
            	for(int i=0;i<N;i++){
            		int cx = scan.nextInt();
            		int cy = scan.nextInt();
            		if(x<=cx&&cx<=x+w&&y<=cy&&cy<=y+h)ans++;
            	}
            	System.out.println(ans);
            	n--;
            }
        }
}