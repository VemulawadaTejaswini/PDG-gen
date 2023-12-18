import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        
      String s[] = new String[N];
      for(int i=0; i<N; i++){
          s[i] =sc.next();//入力されるsが入る箱
      }
      Arrays.sort(s);
        int a =1;
        for(int j=0; j<N-1; j++){
            if(!s[j].equals(s[j+1])){
                 a++;
            }
        }
        System.out.println(a);
      }
}
     
      