import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();
        long W = sc.nextLong();
        long S = H * W;
       if(H==1||W==1){
		System.out.println(1);
	}else{
		 if(S%2==1){
		System.out.println((S-1)/2+1);
	        }else{
	        System.out.println(S/2);
	        }
	}
    }
}

