import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int A = sc.nextInt();
	int tmp = N;
	int flag = 0;
	
	while(A >= 0){
	    if(tmp % 500 == 0){
		flag = 1;;
		break;
	    }else{
		tmp -= 1;
		A -= 1;
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