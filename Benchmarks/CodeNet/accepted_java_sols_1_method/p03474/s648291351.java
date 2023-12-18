import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int flag = 1;
	int a = scan.nextInt();
	int b = scan.nextInt();
	String s = scan.next();

	if(s.length() != a+b+1){
	    flag = 0;
	}
	

	for(int i = 0; i < a; i++){
	    if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
	    }else{
		flag = 0;
	    }
	}


	if(s.charAt(a) != '-'){
	    flag = 0;
	}


	for(int i = a+1; i < s.length(); i++){
	    if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
	    }else{
		flag = 0;
	    }
	}

	if(flag == 1){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}