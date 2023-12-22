import java.util.*;

class Main{
	public static void main(String[] $){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int flag = 0;
    
    for(int i  = 0 ; i < n ; i++){
        int nam = in.nextInt();
		if(nam>=m){
		    flag++;
		}
	}
	System.out.print(flag);
}
}