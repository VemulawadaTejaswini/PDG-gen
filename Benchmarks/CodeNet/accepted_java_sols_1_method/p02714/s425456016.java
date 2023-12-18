import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    long r = 0;
    long g = 0;
    long b = 0;
    for(int i = 0; i < n; i++){
      if(c[i] == 'R'){
        r++;
      }
      if(c[i] == 'G'){
        g++;
      }
      if(c[i] == 'B'){
        b++;
      }
    }
    long ans = r*g*b;
   for(int i = 0; i < n; i++) {
	   for(int j = i + 1; j < n; j++) {
		   int k = j+j-i;
		   if(k <n && c[i] != c[j] && c[j] != c[k] && c[i] !=c[k]) {
			   ans--;
		   }
	   }
   }
   System.out.println(ans);
  }
}