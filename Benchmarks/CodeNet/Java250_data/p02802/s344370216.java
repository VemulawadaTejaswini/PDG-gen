import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		int c = 0;
		int d = 0;       
        if(b>0){int [] in = new int [b];
        String [] str = new String [b];
                int [] in2 = new int [a];
        for(int i=0;i<b;i++){in[i] = sc.nextInt();str[i] = sc.next();                             
                            }		        
        for(int i=0;i<b;i++){if("AC".equals(str[i]) && in2[in[i]-1]>=0)
                                                           {
                                          c++;d+=in2[in[i]-1];in2[in[i]-1]=-1000000;                                                                                     
                            }
                 else {in2[in[i]-1]++;}           
                            }      
               }
		System.out.println(c + " " + d);
	}
}