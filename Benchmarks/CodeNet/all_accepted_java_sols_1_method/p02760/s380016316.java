import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] in = new int [9];        
        for(int i=0;i<9;i++){
                             in[i] = sc.nextInt();                           
                            }
        int b = sc.nextInt(); 
        int [] in2 = new int [b];
        for(int i=0;i<b;i++){
                             in2[i] = sc.nextInt();
                            }
		String s = "No";       
        for(int i=0;i<9;i++){                                               
        for(int j=0;j<b;j++){if(in[i]==in2[j]){in[i]=0;}
                            }
                            }
        if(in[0]+in[1]+in[2]==0 || in[3]+in[4]+in[5]==0 || in[6]+in[7]+in[8]==0 || in[0]+in[3]+in[6]==0
           || in[1]+in[4]+in[7]==0 || in[2]+in[5]+in[8]==0 || in[0]+in[4]+in[8]==0 || in[2]+in[4]+in[6]==0){s="Yes";}
		System.out.println(s);
	}
}
