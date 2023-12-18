import java.io.*;
class Main{
  public static int solution(int x){
    if(x == 0)
      return 1;
    return 0;
  }
 
public static void main(String[] args) throws Exception{
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(buff.readLine());
		System.out.println(solution(n));
	}
}