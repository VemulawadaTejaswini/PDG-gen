import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
        int b = sc.nextInt();
		int c = sc.nextInt();
        int [] in = new int [a-1];
        for(int i=1;i<a;i++){ 
          for(int j=i+1;j<a+1;j++){
                                   in[Math.min(j-i,Math.max(i-b,b-i)+1+Math.max(c-j,j-c))-1]++;                                                        
                                                                                                                
                                  }
                            }     
		for(int i=0;i<a-1;i++){System.out.println(in[i]);}
	}
}
