import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner( System.in);   
	StringBuilder sb = new StringBuilder();
        String str = "";

        int H = kb.nextInt();
	int I = 1;
	while(true){
	    int X = I;
	    if(X>10 && X % 10 != 3 && X % 3 != 0){
		X/=10;
		if(X>10)X%=10;
		if(X!=3) X=I;
		
	    }
	    if(X % 3 == 0 || X % 10 == 3 || X % 100 == 3){
		sb.append(" "+I);
	    }
	    if(I == H)break;
	    I++;
	}
	str=new String(sb);
	System.out.println(str);
    }
}