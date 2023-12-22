import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		 int hito  = in.nextInt();
		 int day  = in.nextInt();
		 int zan  = in.nextInt();
		 
		 int cnt = 0;
		 for(int i = 0; i < hito ; i++){
		     int nam = in.nextInt();
		     if(day%nam == 0){
		       cnt += day/nam;
		     }else{
		       cnt += day/nam+1;
		     }
		 }
        System.out.print(cnt+zan);
	}
}