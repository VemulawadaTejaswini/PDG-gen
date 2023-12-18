import java.util.Scanner;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	for(int i=0;;i++){
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    int C = sc.nextInt();

	    if(A==-1&&B==-1&&C==-1){
		break;
	    }
	    else if(A==-1||B==-1){
		System.out.println("F");
	    }else if(A + B >=80){
		System.out.println("A");
	    }else if(A + B >=65){
		System.out.println("B");
	    }else if((A + B >=50)||(((A+B>=30)&&(50>A+B))&&C>=50)){
		System.out.println("C");
	    }else if(A + B >=30){
		System.out.println("D");
	    }else{
		System.out.println("F");
	    }
	}
    }
}	