import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
        Arrays.sort(in);
		String s = "YES";
        for(int i=0;i<a-1;i++){if(in[i]==in[i+1]){s = "NO";
                                                 break;}
                            }
      
		System.out.println(s);
	}
}
