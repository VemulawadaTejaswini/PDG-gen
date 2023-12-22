import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int res=0;
        int count=0;
        for(int i=0; i<N; i++){
            if(c[i]=='R'){
                count++;
            }
        }
        int red=0;
        for(int i=0; i<count; i++){
            if(c[i]=='R'){
                red++;
            }
        }
        System.out.println(count-red);
        
        
        
        
        
        }
    }