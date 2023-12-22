import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int non = 0;
        for(int i=0; i<S.length(); i++){
            if(i%2==0 && S.charAt(i)== 'L'){
 		            non++;
	}
}
        for(int i=0; i<S.length(); i++){	       
            if(i%2!=0 && S.charAt(i)== 'R'){
 		            non++;
            }
}
	    if(non>0){
	        System.out.println("No");
	    }else{
	        System.out.println("Yes");	        
	    }
	}
}