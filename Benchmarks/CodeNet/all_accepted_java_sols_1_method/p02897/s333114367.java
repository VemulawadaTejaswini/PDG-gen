import java.util.*;

class Main{
	public static void main(String[] $){
    Scanner in = new Scanner(System.in);
    double n = in.nextInt();
    double nam = 0;
    
    for(int i = 1; i <= n ; i++){
        if(i%2!=0){
            nam++;
        }
    }
	System.out.print(nam/n);
}
}
