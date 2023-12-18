import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
      	int cnt = 0;
      	if(h % a != 0)
          cnt++;
        cnt += h / a;
        System.out.println(cnt);
    }
}