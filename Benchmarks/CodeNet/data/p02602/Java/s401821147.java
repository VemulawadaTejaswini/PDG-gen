import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		int [] in = new int [a];
       
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
	
        for(int i=0;i<a-b;i++){if(in[i]<in[i+b]){System.out.println("Yes");
                                                 }
                               else{System.out.println("No");}
                            }
        
		
	}
}
