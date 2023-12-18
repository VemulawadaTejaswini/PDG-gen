import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    int c = 0;
	    if(n==0) {
		break;
	    }
	    else if(n==6174){
		System.out.println(c);
	    }
	    else{
		while(n!=6174){
		    c++;
		    int[] num = new int[4];
		    num[0] = (n/1000);
		    num[1] = (n-num[0]*1000)/100;
		    num[2] = (n-num[0]*1000-num[1]*100)/10;
		    num[3] = n-num[0]*1000-num[1]*100-num[2]*10;
		    
		    //System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]);

		    if(num[0]==num[1] && num[2]==num[3] && num[1]==num[2]){
			System.out.println("NA");
			break;
		    }
		    else{
			//テ」ツつステ」ツδシテ」ツδ?
			for(int i=0; i<num.length; i++){
			    for(int j=i; j<num.length; j++){
				if(num[i]<num[j]){
				    int w = num[i];
				    num[i] = num[j];
				    num[j] = w;
				}
			    }
			}
			//ティツィツ暗ァツョツ?
			int L = num[0]*1000 + num[1]*100 + num[2]*10 + num[3];
			int S = num[3]*1000 + num[2]*100 + num[1]*10 + num[0];
			n = L-S;
			//System.out.println(n);
		    }
		}
		if(n==6174) System.out.println(c);
	    }
	}
    }
}