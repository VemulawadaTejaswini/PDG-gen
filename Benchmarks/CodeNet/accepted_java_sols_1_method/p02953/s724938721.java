import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a+1];
        in[0] = 0;
        String s = "Yes";
        for(int i=1;i<a+1;i++){
                               in[i] = sc.nextInt();
                              }
        for(int i=1;i<a+1;i++){if(in[i]<in[i-1]){s="No";break;
                                                }
                              if(in[i]>in[i-1]){in[i]--;}
                              }      
		System.out.println(s);
	}
}
