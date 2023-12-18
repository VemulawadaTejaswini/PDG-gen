import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int w = sc.nextInt();
      	int h = sc.nextInt();
      	int n = sc.nextInt();
      	int t = h;
      	int b = 0;
      	int l = 0;
      	int r = w;
      	for(int i = 0; i < n; i++){
      		int x = sc.nextInt();
      		int y = sc.nextInt();
      		int a = sc.nextInt();
        	if(a == 1){l = Math.max(l, x);}
        	else if(a == 2){r = Math.min(r, x);}
        	else if(a == 3){b = Math.max(b, y);}
        	else if(a == 4){t = Math.min(t, y);}
        }
      	if(l >= r || b >= t){
          System.out.println(0);
        }else{
      		int ans = (r - l) * (t - b);
			System.out.println(ans);
        }
	}
}
