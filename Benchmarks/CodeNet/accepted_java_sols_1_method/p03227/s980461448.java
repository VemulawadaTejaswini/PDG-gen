import java.util.Scanner;



class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String a =sc.nextLine();
    	StringBuffer sb = new StringBuffer(a);
		String dst = sb.reverse().toString();

    	if(a.length()==3){
    		System.out.println(dst);
    	}else{
    		System.out.println(a);
    	}

    }

}