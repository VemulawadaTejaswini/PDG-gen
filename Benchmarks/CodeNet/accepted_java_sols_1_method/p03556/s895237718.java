import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iline = sc.nextInt();
		int reti = 0;
        for(int i=1;;i++){
        	if(iline<i*i){
        		break;
        	}
        	reti++;
        }
        
		System.out.println(reti*reti);
    }
}
