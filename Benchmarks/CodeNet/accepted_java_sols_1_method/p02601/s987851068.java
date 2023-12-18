import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int k=sc.nextInt();
        int aa=0;
        int bb=0;
        if(a<b){aa=0;}
        else if(a<(2*b)){aa=1;}
        else if(a<(4*b)){aa=2;}
        else if(a<(8*b)){aa=3;}
        for(int i=0;i<aa;i++){
        	b=b*2;
        }
        if(b<c){bb=0;}
        else if(b<(2*c)){bb=1;}
        else if(b<(4*c)){bb=2;}
        else if(b<(8*c)){bb=3;}
        else if(b<(16*c)){bb=4;}
        if(k>=(aa+bb)){System.out.println("Yes");}
        else{System.out.println("No");}
        }

}