import java.util.Scanner;

class Main{
	public static void main(String[] args){
     	Scanner sc = new Scanner(System.in);
      	String s = sc.nextLine();
      	String[] spl = s.split(" ");
      	int N = Integer.parseInt(spl[0]);
      	int D = Integer.parseInt(spl[1]);
      	int ans = N / (D * 2 + 1);
      	int mod = N % (D * 2 + 1);
      	if(mod == 0){
      		System.out.println(ans);
        }else{
          	System.out.println(ans + 1);
        }
    }
}