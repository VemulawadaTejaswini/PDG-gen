import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
       
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
		int b = 0;
        for(int i=0;i<a-2;i++){if((in[i+1]-in[i])*(in[i+1]-in[i+2])<0){b++;
                                                 }
                            }
       
		System.out.println(b);
	}
}
