import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      	int ret = -1;
      	int cnt = 1;
      	while(ret <= -1){
          ret = cnt*1000 - a;
          cnt++;
        }
		
      	System.out.println(ret);
    }
}